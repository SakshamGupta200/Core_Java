package FileHandling;

import java.io.*;

public class BufferedinputStream1 {
    public static void main(String[] args) {
        try{
            FileInputStream FIS=new FileInputStream("SKG.txt");
            BufferedInputStream BIS=new BufferedInputStream(FIS);
            int i;
            while((i=BIS.read())!=-1){
                System.out.print((char)i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
