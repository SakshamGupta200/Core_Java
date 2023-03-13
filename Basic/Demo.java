package Basic;

import java.util.Scanner;
public class Demo 
{
    public static void main(String[] args) {
        float r,a,p;
        Scanner S= new Scanner(System.in);
        System.out.println("Enter radius");
        r=S.nextFloat();
        float pi= 3.14f;
        a=pi*r*r;
        p=2*pi*r;
        System.out.println("Area = " +a);
        System.out.println("Perimeter = " +p);
    }
    
}
