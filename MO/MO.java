package MO;
import java.util.Scanner;
class Sample{
    int get(int a){
        return a*a;
    }
    int get(int a, int b)
    {

        return a+b;
    }
    int get(int a, int b, int c){

        return a+b+c;
    }
}


public class MO {
    public static void main(String[] args) {
        Sample Obj=new Sample();
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number for square: ");
        a=sc.nextInt();

        d= Obj.get(a);
        System.out.println("Square = "+d);

        System.out.println("Enter two numbers for add:");
        a=sc.nextInt();
        b=sc.nextInt();
        d= Obj.get(a,b);
        System.out.println("Sum = "+d);

        System.out.println("Enter three numbers for add:");
        a=sc.nextInt();
        b=sc.nextInt();
        c= sc.nextInt();
        d= Obj.get(a,b,c);
        System.out.println("Sum = "+d);
    }
}
