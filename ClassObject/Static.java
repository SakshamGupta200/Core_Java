package ClassObject;
import java.util.Scanner;
class st {
    int id;
    String name;
    static String College="Mahadev P.G.College";
    st(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println("Id="+id);
        System.out.println("Name="+name);
        System.out.println("Collge="+College);

    }
}
public class Static{
    public static void main(String[] args) {
        int id;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        name= sc.nextLine();
        System.out.println("Enter your id :");
        id= sc.nextInt();
        st ob=new st(id,name);
        ob.display();
    }
}

