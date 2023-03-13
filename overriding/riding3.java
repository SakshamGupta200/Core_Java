package overriding;

class Animal{
    String color="Black";
    void display(){
        System.out.println(color);
    }
}
class Dog extends Animal{
    String color="White";
    void display(){
        super.display();
        System.out.println(color);
    }

}

public class riding3 {
    public static void main(String[] args) {
        Dog D=new Dog();
        D.display();
    }
}
