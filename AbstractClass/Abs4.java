package AbstractClass;
import java.util.Scanner;
abstract class A1{
    abstract int sum(int a, int b );

    }


abstract class A2 extends A1{
    abstract int sub(int p, int q);
    public int sum(int a, int b){
        return a+b;

    }
}


public class Abs4 extends A2{
    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        Abs4 ob=new Abs4();

        System.out.println("Enter two numbers :");
        a= sc.nextInt();
        b= sc.nextInt();
        c= ob.sub(a,b);
        System.out.println("Sub = "+c);
        c=ob.sum(a,b);
        System.out.println("Sum = "+c);

    }
}
