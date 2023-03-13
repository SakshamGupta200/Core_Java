package Basic;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Squareroot {
    public static void main(String[] args) {
        long a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        a= sc.nextInt();
        b= (long) sqrt(a);
        System.out.println("Square root = "+b);
    }
}
