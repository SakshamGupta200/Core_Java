package Basic;

import java.util.Scanner;
class Curr
{
public static void main(String arg[])
{
float a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Rupee");
a=sc.nextFloat();

c=a/74;
System.out.println(a+ " Rupees = " +c+ " Dollar");

System.out.println("Enter Dollar");
b=sc.nextFloat();
d=b*74;
System.out.println(b+ " Dollar = " +d+ " Rupees");
}
}

