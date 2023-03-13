package Inheritance;
import java.util.Scanner;
class A{
    int rollno=1000;

}




public class Single  extends A{
    String name="Rahul";
    public static void main(String[] args) {
        Single obj=new Single();
        System.out.println(obj.rollno);
        System.out.println(obj.name);
    }
}
