package AbstractClass;

import java.util.Scanner;

abstract class SS{
    abstract int sum(int a, int b);
    abstract int sub(int a, int b);
}

public class Abs2 extends SS{
    public int sum(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        int a,b,c;
        Abs2 ob=new Abs2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a= sc.nextInt();
        b=sc.nextInt();
        c=ob.sum(a,b);
        System.out.println(c);
        c=ob.sub(a,b);
        System.out.println(c);
    }
}
