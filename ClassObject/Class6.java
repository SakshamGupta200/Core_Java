package ClassObject;
import java.util.*;


class Car {
    String Modno, Modname;
   //instance constructor
    Car(String Mno, String MN) {
        Modno = Mno;
        Modname = MN;
    }
    //copy constructor
    Car(Car c)
    {
        Modno=c.Modno;
        Modname=c.Modname;
    }
    void get() {
        System.out.println("Your modal number is " + Modno + " and modal name is " + Modname);

    }


}
public class Class6 {
    public static void main(String[] args) {
        String Modno,Modname;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter modal number :");
        Modno=sc.nextLine();
        System.out.println("Enter modal name :");
        Modname=sc.nextLine();
        Car ob=new Car(Modno,Modname);
        ob.get();
        Car c1=new Car(ob);
        c1.get();
    }
}

