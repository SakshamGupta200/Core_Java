package ClassObject;
import java.util.Scanner;

class St{
    int sum(int a, int b){
          return (a+b);
    }
    static int mul(int a, int b){
        return (a*b);
    }
}


public class Staticarith {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter two numbers :");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        St ob=new St();
        c= ob.sum(a,b);
        System.out.println(c);
        c=St.mul(a,b);
        System.out.println(c);
    }
}
