package FileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedOutputStream1 {
    public static void main(String[] args) {
        String ss;
        try{
            FileOutputStream FIS =new FileOutputStream("SP.txt");

            BufferedOutputStream BOS=new BufferedOutputStream(FIS);
            ss="good morning every";
            byte[] bb=ss.getBytes();
            BOS.write(bb);
            BOS.flush();
            BOS.close();
            FIS.close();
            System.out.println("File created successful");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
