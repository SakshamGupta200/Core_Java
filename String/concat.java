package String;
import java.util.Scanner;
public class concat {
    public static void main(String[] args) {
        String S,S1;
        String S2="Mr.",S3="Ms.";
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter name :");
        S= sc.nextLine();
        System.out.println("Enter gender :");
        S1= sc.nextLine();
        if (S1.equals("male")){
            System.out.println(S2.concat(S));
        }
        else
        {
            System.out.println(S3.concat(S));
        }
    }
}
