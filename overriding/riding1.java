package overriding;
import java.util.Scanner;
class Stp{
    void get(int a, int b){
        System.out.println(a-b);
    }
}

class Sample extends Stp{
    void get(int a, int b){
        System.out.println(a+b);
    }
}

public class riding1 {


    public static void main(String[] args) {
        Sample S=new Sample();
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two numbers :");
        a= sc.nextInt();
        b= sc.nextInt();


        S.get(a,b);
    }
}
