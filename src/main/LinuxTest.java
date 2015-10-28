package main;

import java.io.File;
import java.io.IOException;

public class LinuxTest {
    public static void main(String[] args) {
       // String pathFromCommand = args[0];
        //String executeCommand = args[1];
        //String path[] = { pathFromCommand, executeCommand, "java -jar LinuxTestNormalization.jar" };
        //String path[] = {"java -jar LinuxTestNormalization.jar" };
       // System.out.println("PathFromCommand:" + path[0]);
        //System.out.println("ExecuteCommand:" + path[1]);
        File dir = new File("/root/Desktop/RunMe/Edi837p/Edi837p/");
        try {
            Runtime.getRuntime().exec("java -jar edi-837p-normalization.jar", null, dir);
            System.out.println("successfully executed");
        } catch (IOException e) {
            System.out.println("Error in LinuxTest");
            e.printStackTrace();
        }
    }
}
