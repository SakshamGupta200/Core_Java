package Multithreading;

class T1 extends Thread{
    public void run(){
        System.out.println("Thread running");
    }
}

public class Thread1 {
    public static void main(String[] args) {
        T1 ob=new T1();
        ob.start();
    }
}
