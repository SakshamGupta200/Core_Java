package FileHandling;
import java.io.*;
public class File2 {
    public static void main(String[] args) {
       try {
           int st;
           String ext;
           File dir =new File("e:\\saksham");
           File[ ] file= dir.listFiles();
           for (File fname: file) {
               String str= fname.toString();
                st=str.lastIndexOf(".");
                ext=str.substring(st+1);
               System.out.println(ext);
           }
       }catch (Exception e){
           e.printStackTrace();
       }

    }
}
