package FileHandling;
import java.io.*;
import java.util.Scanner;

public class SimpleTesting {
    public static void main(String[] args){
       try{
           String folderPath="E:\\saksham\\Java Coaching\\src";

           File folder=new File(folderPath);
           File[] files=folder.listFiles();

            for(File file:files){
                if(file.isFile()){
                    System.out.println("File -> "+file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("Folder -> "+file.getName());

                }
            }


       }catch (Exception e){
           e.printStackTrace();
       }
    }
}