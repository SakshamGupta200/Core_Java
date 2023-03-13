package AbstractClass;

abstract class AB{
    abstract void msg();
    public void display(){
        System.out.println("Good morning");
    }


}

public class Abs1 extends AB{
    public void msg(){
        System.out.println("Good night");
    }

    public static void main(String[] args) {
        Abs1 ob=new Abs1();
        ob.msg();
        ob.display();
    }
}
