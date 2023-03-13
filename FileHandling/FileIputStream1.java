package FileHandling;

import java.io.*;

public class FileIputStream1 {
    public static void main(String[] args) {
        try {
            FileInputStream FIS = new FileInputStream("Sk2.txt");
            int i;
            while((i=FIS.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
