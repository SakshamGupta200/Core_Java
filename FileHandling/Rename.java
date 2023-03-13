package FileHandling;

import java.io.*;
public class Rename {
    public static void main(String[] args) {
        File f=new File("SK.txt");
        File f1=new File("SK88.txt");
        if (f.renameTo(f1)){
            System.out.println("File renamed successfull");
        }
        else {
            System.out.println("Not changed ");
        }
    }
}
