package ExceptionalHandling;


import java.util.Scanner;
public class EH1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int a, b, c;
            System.out.println("Enter two numbers :");
            a = sc.nextInt();
            b = sc.nextInt();
            c = a / b;
            System.out.println("Result = " + c);
        }
        catch(Exception e)

        {
            System.out.println(e);
        }
        finally {
            System.out.println("thank you for using my application");
        }
    }
}
