package ClassObject;
import java.util.Scanner;
class A{
    String name;
 void get(){

     System.out.println("Welcome , "+name);
 }
 void set(String S){

     name=S;
 }
}

 class Class1 {
    public static void main(String[] args) {
        A obj=new A();
        String S;
        System.out.println("Enter your name :");
        Scanner sc=new Scanner(System.in);
        S= sc.nextLine();
        obj.set(S);
        obj.get();
    }
}
