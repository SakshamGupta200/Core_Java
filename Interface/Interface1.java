package Interface;

import java.util.Scanner;

interface Myint{
    void msg();
    int sum(int a, int b);
}


public class Interface1 implements Myint{

    public void msg() {
        System.out.println("good morning");
    }


    public int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Interface1 ob=new Interface1();

        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        a= sc.nextInt();
        b= sc.nextInt();
        ob.msg();
        c= ob.sum(a,b);
        System.out.println("Sum = "+c);
    }
}
