package MO;

import java.util.Scanner;

class St{
    int set(int a, int b){
        return a+b;
    }
    double set(double a, double b){
        return a+b;
    }
}

public class MO1 {
    public static void main(String[] args) {
        St ob=new St();
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double p,q,r;
        System.out.println("Enter two int numbers :");
        a=sc.nextInt();
        b= sc.nextInt();
        c= ob.set(a,b);
        System.out.println("sum = "+c);
        System.out.println("Enter two double numbers :");
        p=sc.nextDouble();
        q= sc.nextDouble();
        r= ob.set(p,q);
        System.out.println("sum = "+r);
    }
}
