package FileHandling;

import java.io.File;

public class File4 {
    public static void main(String[] args) {
        File f=new File("SP.txt");
        System.out.println("File name "+f.getName());
        System.out.println("Can write "+f.canWrite());
        System.out.println("Hidden file "+f.isHidden());
        System.out.println("Fie length "+ f.length()+" byte");
    }
}
