package overriding;

class animal{
    int id;
    String color;
    animal(int id, String color){
        this.id=id;
        this.color=color;
    }
}
class dog extends animal{
    String breed;
    dog(int id, String color, String breed){
        super(id, color);
        this.breed=breed;
    }
    void display(){
        System.out.println(id+","+color+","+breed);
    }
}

public class riding5 {
    public static void main(String[] args) {
        dog dg=new dog(111,"white","bulldog");
        dg.display();
    }
}
