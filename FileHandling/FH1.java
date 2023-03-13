package FileHandling;
import java.io.*;


public class FH1 {
    public static void main(String[] args) {
        File f=new File("E:\\saksham\\Java Coaching\\src\\FileHandling\\Saksham.txt");
        if (f.exists()){
            System.out.println("File name "+f.getName());
            System.out.println("Path = "+f.getAbsolutePath());
            System.out.println("Canwrite "+f.canWrite());
            System.out.println("canread "+f.canRead());
            System.out.println("Length "+f.length());


        }
        else {
            System.out.println("File not created");
        }
    }
}
