package ClassObject;
import java.util.Scanner;
class Sub{
    void Sub(int a,int b){
        int c;
        c=a-b;
        System.out.println("Subtract of "+a+" & "+b+" are : "+c);
    }
    void add(int a,int b){
        int c;
        c=a+b;
        System.out.println("Add of "+a+" & "+b+" are : "+c);
    }
}
public class Class3 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers :");
        a=sc.nextInt();
        b=sc.nextInt();
        Sub ob=new Sub();
        ob.Sub(a,b);
        ob.add(a,b);
    }
}
