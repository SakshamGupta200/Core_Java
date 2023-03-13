package FileHandling;

import java.io.File;

public class Validate {
    public static void main(String[] args) {
        try{
           File f=new File("SK.txt");
            if (f.createNewFile()){
                System.out.println("File created");
            }
            else {
                System.out.println("File Existed");
            }
            if (f.exists()){
                System.out.println("File found");

            }
            else {
                System.out.println("File not found");
            }
            System.out.println(f.getAbsolutePath());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
