package Inheritance;



class father {
    void property() {
        System.out.println("Father have lots of property");
    }
}
class Son extends father{
    void st(){
        System.out.println("I am son");
    }
}

class Daughter extends father{
    void Dt(){
        System.out.println("I am Daughter");
    }
}
public class Hierarichal {
    public static void main(String[] args) {
        Son S=new Son();
        Daughter D= new Daughter();
        S.st();
        S.property();
        D.Dt();
        D.property();
    }
}