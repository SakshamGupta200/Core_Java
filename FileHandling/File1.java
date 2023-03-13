package FileHandling;
import java.lang.*;
import java.io.*;
public class File1 {
    public static void main(String[] args) {
        try{
            int str;
            String a,ext;
            File fname=new File("SKG.txt");
            a=fname.toString();
            str=a.lastIndexOf(".");
            ext=a.substring(str+1);
            System.out.println(ext);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
