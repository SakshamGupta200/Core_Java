
package condition;
import java.util.Scanner;

public class Cond 
{
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        a=sc.nextInt();
        if(a<0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is positive");
        }
    }
}
