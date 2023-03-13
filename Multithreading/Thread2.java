package Multithreading;

class T2 implements Runnable{
    public void run() {
        for (int i=1; i<=10; i++){
            System.out.println("Thread running "+i );
            try{
                Thread.sleep(1000);

            }catch (Exception e){
                System.out.println(e);
            }

        }

    }
}


public class Thread2 {
    public static void main(String[] args) {
        T2 ob=new T2();
        Thread T=new Thread(ob);
        Thread T4=new Thread(ob);
        T.start();
        try {
            T.join();
        }catch(Exception f){
            System.out.println(f);
        }

        T4.start();
    }
}
