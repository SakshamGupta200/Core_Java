package FileHandling;
import java.io.*;
import java.util.*;

public class FNEN {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            String str,name,ext;
            int a=0,b=0;
            System.out.println("Enter path of file : ");
            str= sc.nextLine();
            a=str.lastIndexOf('\\');
            b=str.lastIndexOf('.');
            name=str.substring(a+1,b);
            ext=str.substring(b+1);
            System.out.println(name);
            System.out.println(ext);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
