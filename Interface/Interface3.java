package Interface;

import java.util.Scanner;

interface Myint3{
    void msg();
    int sum(int a, int b);
}
interface Myint4{
    void display();
    int sub(int p, int q);

}

public class Interface3 implements Myint3,Myint4{
    @Override
    public int sub(int p, int q) {
        return p-q;
    }

    @Override
    public void display() {
        System.out.println("hii");
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public void msg() {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        Interface3 ob=new Interface3();
    }
}
