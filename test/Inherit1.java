package test;
interface I1{
   void get();
}
interface I2 extends I1{
    void set();
}

public class Inherit1 implements I2 {
    @Override
    public void get() {
        System.out.println("Hii");
    }

    @Override
    public void set() {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        Inherit1 ob=new Inherit1();
        ob.get();
        ob.set();
    }
}
