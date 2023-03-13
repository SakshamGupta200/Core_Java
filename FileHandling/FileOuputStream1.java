package FileHandling;

import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileOuputStream1 {
    public static void main(String[] args) {
        try{
            String st;
            Scanner sc=new Scanner(System.in);
            System.out.println("write your file contents");
            st=sc.nextLine();
            FileOutputStream FOS=new FileOutputStream("Sk2.txt");
            byte[] bb=st.getBytes();
            FOS.write(bb);
            FOS.close();
            System.out.println("file written succeesful");

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
