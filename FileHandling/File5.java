package FileHandling;
import java.io.*;
public class File5 {
    public static void main(String[] args) {
        File f=new File("SKG.txt");
        if (f.delete()){
            System.out.println(f.getName()+" deleted");

        }
        else {
            System.out.println("Not found");
        }
    }
}
