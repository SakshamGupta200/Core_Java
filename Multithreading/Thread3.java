package Multithreading;

class T6 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class Thread3 {
    public static void main(String[] args) {
        T6 ob=new T6();
        T6 ob1=new T6();
        ob.start();
        ob1.start();
        ob.setName("Sk");
        ob1.setName("Tk");
        ob.start();
        ob1.start();
    }
}
