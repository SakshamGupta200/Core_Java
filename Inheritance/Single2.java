package Inheritance;

class Animal{
    void eat(){
        System.out.println("Animals are eating.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking.");
    }
}

public class Single2 {
    public static void main(String[] args) {
        Dog D=new Dog();
        D.eat();
        D.bark();
    }
}
