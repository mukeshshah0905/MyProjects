package main;

import java.io.File;
import java.io.FileInputStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
 
/**
* @author kodehelp
*
*/
public class SFTPInJava {
 
/**
*
*/
public SFTPInJava() {
// TODO Auto-generated constructor stub
}
 
/**
* @param args
*/
public static void main(String[] args) {
String SFTPHOST = "89.188.8.37";
int    SFTPPORT = 22;
String SFTPUSER = "slots";
String SFTPPASS = "pGv5f3n>pRH";
String SFTPWORKINGDIR = "/home/slots/sftpwork";
Session     session     = null;
Channel     channel     = null;
ChannelSftp channelSftp = null;
 
try{
            JSch jsch = new JSch();
            session = jsch.getSession(SFTPUSER,SFTPHOST,SFTPPORT);
            session.setPassword(SFTPPASS);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp)channel;
            channelSftp.cd(SFTPWORKINGDIR);
            File f = new File("D:\\jsontest4922226sdfs.txt");
            channelSftp.put(new FileInputStream(f), f.getName());
            channel.disconnect();
            session.disconnect();
}catch(Exception ex){
ex.printStackTrace();
}
 
}
 
}
