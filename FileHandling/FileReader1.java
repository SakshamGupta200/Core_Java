package FileHandling;
import java.io.*;
public class FileReader1 {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("SKG.txt");
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.print((char)i);
            }

        }catch(Exception E){
            E.getMessage();
        }
    }
}
