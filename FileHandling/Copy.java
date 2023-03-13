package FileHandling;

import java.io.*;
import java.util.*;
public class Copy {
    public static void main(String[] args) {
        try {
        FileInputStream FIS=new FileInputStream("Sk2.txt");
            FileOutputStream FOS=new FileOutputStream("E:\\saksham\\Java Coaching\\src\\FileHandling\\Sk2.txt");
            File f=new File("Sk2.txt");
            int i;
            String S;
            while((i=FIS.read())!=-1){
                System.out.print((char)i);
                FOS.write(i);
            }
            System.out.println();
            System.out.println("File copy successfull");

f.delete();
            System.out.println("Deleted");

        }


        catch (Exception e){
            e.printStackTrace();
        }
    }
}
