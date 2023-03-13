package Interface;

import java.util.Scanner;

interface Myint1{
    void msg();
    int sum(int a, int b);
}
interface Myint2 extends Myint1{
    void display();
    int sub(int p, int q);

}

public class Interface2 implements Myint2{

    @Override
    public void msg() {
        System.out.println("Hii");
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public void display() {
        System.out.println("Bye");
    }

    @Override
    public int sub(int p, int q) {
        return p-q;
    }

    public static void main(String[] args) {
        Interface2 obj=new Interface2();
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        a= sc.nextInt();
        b= sc.nextInt();
        obj.msg();
        c= obj.sum(a,b);
        System.out.println(c);
        c= obj.sub(a,b);
        System.out.println(c);
        obj.display();
    }



}
