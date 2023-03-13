package Constructorchaining;

class C1{
    C1(){
        System.out.println("Default constructor");
    }
    C1(int a){
        this();
        System.out.println(a*a);
    }
    C1(int a, int b){
        this(a);

        System.out.println(a+b);
    }
}

public class CC1 {
    public static void main(String[] args) {
       // C1 ob=new C1();
        //C1 obj=new C1(5);
        C1 obj1=new C1(44,55);
    }
}
