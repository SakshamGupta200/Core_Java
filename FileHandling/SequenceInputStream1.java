package FileHandling;
import java.io.*;
public class SequenceInputStream1 {
    public static void main(String[] args) {
        try{
            FileInputStream F1=new FileInputStream("SKG.txt");
            FileInputStream F2=new FileInputStream("SP.txt");
            SequenceInputStream SIS=new SequenceInputStream(F1,F2);
            int i;
            while((i=SIS.read())!=-1){
                System.out.print((char)i);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
