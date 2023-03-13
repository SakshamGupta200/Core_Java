package ClassObject;

import java.util.Scanner;
class Car1{
    String Modno,Modname ;
    void get(){
        System.out.println("Your modal number is "+Modno+" and modal name is "+Modname );

    }
    Car1(String Mno, String MN){
        Modno=Mno;
        Modname=MN;
    }
    /*void set(String Mno, String MN){
        Modno=Mno;
        Modname=MN;
    }*/
}

public class Class2 {
    public static void main(String[] args) {
        String Modno,Modname;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter modal number :");
        Modno=sc.nextLine();
        System.out.println("Enter modal name :");
        Modname=sc.nextLine();
       Car1 ob=new Car1(Modno,Modname);


        ob.get();
    }
}
