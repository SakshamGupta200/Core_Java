package FileHandling;
import java.io.*;
import java.util.Scanner;

public class Filewriter1 {
    public static void main(String[] args) {
       try{
           String S;
           FileWriter FW=new FileWriter("SKG.txt");
           Scanner sc=new Scanner(System.in);
           System.out.println("Write your message");
           S= sc.nextLine();
           FW.write(S);
           FW.close();
           System.out.println("File created successfully.");
       }
       catch (Exception E ){
           E.printStackTrace();
       }


    }
}
