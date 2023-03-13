package FileHandling;

import java.io.File;
import java.util.Scanner;

public class File3 {

    public static void main(String[] args) {
        try{
      String Dname;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter path & directory name");
        Dname=sc.nextLine();
            File fname=new File(Dname);
            boolean b=fname.mkdirs();
            if (b){
                System.out.println("directory created");
            }
            else {
                System.out.println("Error");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
