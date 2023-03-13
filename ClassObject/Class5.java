package ClassObject;
import java.util.Scanner;

class Sum {
    Sum() {}
        Sum( int a){
            int c;
            c = a * a;
            System.out.println("Square of " + a + " is " + c);

        }
        Sum( int a, int b){
        this(a);
            int c;
            c = a + b;
            System.out.println("Sum of " + a + " and " + b + " is " + c);
        }
        Sum( int a, int b, int c){
            this(a,b);
            int d;
            d = a * b * c;
            System.out.println("Multyply of " + a + " , " + b + " and " + c + " is " + d);

        }
        void get () {
            System.out.println("Hiiiiiiiiii");
        }
    }


public class Class5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        a=sc.nextInt();
        System.out.println("Enter second number :");
        b=sc.nextInt();
        System.out.println("Enter third number :");
        c=sc.nextInt();

        Sum S3=new Sum(a,b,c);

    }
}
