package String;
import java.util.Scanner;
public class Validate {
    public static void main(String[] args) {
        String S;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string :");
        S = sc.nextLine();
        if (S.length()<=50){
            System.out.println(S);
        }
        else
        {
            System.out.println("Length is over");
        }
    }
}
