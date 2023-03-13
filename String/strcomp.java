package String;
import java.util.Scanner;
public class strcomp {
    public static void main(String[] args) {
        String S,S1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter first string :");
        S= sc.nextLine();
        if ((S.isEmpty())){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
