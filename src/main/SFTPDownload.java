package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SFTPDownload {
    public static void main(String[] args) {
        String SFTPHOST = "172.16.9.191";
        int SFTPPORT = 22;
        String SFTPUSER = "manish";
        String SFTPPASS = "12345";
        String SFTPWORKINGDIR = "/shailendra";

        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;

        try {
            JSch jsch = new JSch();
            session = jsch.getSession(SFTPUSER, SFTPHOST, SFTPPORT);
            session.setPassword(SFTPPASS);
            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp) channel;
            channelSftp.cd(SFTPWORKINGDIR);
            List<ChannelSftp.LsEntry> files = channelSftp.ls(SFTPWORKINGDIR);
            for (ChannelSftp.LsEntry file : files) {
                String fileName = file.getFilename();
                System.out.println(fileName);
                if (!(fileName.equals(".")) && !(fileName.equals(".."))) {
                    OutputStream os = null;
                    BufferedInputStream bis = null;
                    BufferedOutputStream bos = null;
                    try{
                        byte[] buffer = new byte[1024];
                        bis = new BufferedInputStream(channelSftp.get(fileName));
                        File newFile = new File("D:/" + fileName);
                        os = new FileOutputStream(newFile);
                        bos = new BufferedOutputStream(os);
                        while (( bis.read(buffer)) > 0) {
                            bos.write(buffer);
                        }
                        channelSftp.rm(fileName);
                    }catch(IOException io){
                        io.printStackTrace();
                    }finally{
                        bis.close();
                        bos.close();
                        os.close();
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            channelSftp.disconnect();
            channel.disconnect();
            session.disconnect();
        }
        
    }
}
