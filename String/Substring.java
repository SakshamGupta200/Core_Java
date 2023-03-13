package String;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        String find, replace;
        String S1;
        System.out.println("Enter any string :");
        Scanner sc =new Scanner(System.in);
        S1=sc.nextLine();
        System.out.println("Enter the finding string :");
        find=sc.nextLine();
        System.out.println("Enter replace string :");
        replace=sc.nextLine();
        System.out.println(S1);
        System.out.println(S1.replace(find,replace));

    }
}
