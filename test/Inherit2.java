package test;

abstract class Abs0{
    abstract void get();
}
abstract class Abs33 extends Abs0{
    abstract void set();
}

public class Inherit2 extends Abs33{
    public void get(){
        System.out.println("Rk");
    }
    public void set(){
        System.out.println("SG");
    }

    public static void main(String[] args) {
        Inherit2 ob=new Inherit2();
        ob.get();
        ob.set();
    }
}
