package Inheritance;

class a{
    void get(){
        System.out.println("hiiii");
    }
}
class b extends a{
    void set(){
        System.out.println("Byee");
    }
}
public class Multi extends b{
    void pet(){
        System.out.println("Phir milte hai");
    }
    public static void main(String[] args) {
        Multi M=new Multi();
        M.get();
        M.set();
        M.pet();
    }
}
