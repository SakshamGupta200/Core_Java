package Finall;

class  Car {
    final int speed=50;
    public void display(){
        //speed=100;
        System.out.println("Car speed is "+speed);
    }
}

public class F1 {
    public static void main(String[] args) {
        Car C=new Car();
        C.display();
    }
}
