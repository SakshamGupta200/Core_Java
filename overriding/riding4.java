package overriding;

class A{
    A(){
        System.out.println("Parent constructor");
    }
}
class B extends A{
    B(){
        System.out.println("Child constructor");
    }
}

public class riding4 {
    public static void main(String[] args) {
        B o=new B();

    }
}
