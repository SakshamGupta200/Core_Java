package AbstractClass;
import java.util.Scanner;

abstract class A{
    abstract int sum(int a, int b);

}
abstract class B extends A{
    abstract int sub(int a, int b);
}

public class Abs3 extends B{
    public int sum(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        int a,b,c;
        Abs3 ob=new Abs3();
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b= sc.nextInt();
        c=ob.sum(a,b);
        System.out.println(c);
        c= ob.sub(a,b);
        System.out.println(c);
    }
}
