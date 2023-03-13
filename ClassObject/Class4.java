package ClassObject;
import java.util.Scanner;

class AC{
    int a;
    int b;
    AC(int a,int b){
        this.a=a;
       this.b=b;

    }
    void sum()
    {
        int c=a+b;
        System.out.println("Result="+c);
    }
}

public class Class4 {
    public static void main(String[] args) {
        AC obj=new AC(10,28);
        obj.sum();
    }
}
