package FileHandling;
import java.io.*;
public class File6 {
    public static void main(String[] args) {
        File f=new File("SP.txt");
        f.deleteOnExit();
        if (f.exists()){
            System.out.println("file exists");
        }
        else {
            System.out.println("file delete");
        }
    }
}
