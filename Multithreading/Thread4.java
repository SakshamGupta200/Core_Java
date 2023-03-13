package Multithreading;
class T7 extends Thread{
    public void run(){
        int i;
        for (i=1;i<=5;i++){
        System.out.println("Thread : "+i);
        }
    }
}



public class Thread4 {
    public static void main(String[] args) {
        T7 ob=new T7();
        T7 ob1=new T7();
        T7 ob2=new T7();
        ob.setPriority(Thread.MIN_PRIORITY);
        ob1.setPriority(Thread.MAX_PRIORITY);
        ob2.setPriority(Thread.NORM_PRIORITY);
        ob.start();
        ob1.start();
        ob2.start();
        System.out.println(ob.getPriority());
        System.out.println(ob1.getPriority());
        System.out.println(ob2.getPriority());

    }
}
