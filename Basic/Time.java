package Basic;

import java.util.Scanner;
class Time
{
public static void main(String arg[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter second");
a=sc.nextInt();
b=a/3600;
a=a%3600;
c=a/60;
a=a%60;
System.out.println("Hour is " +b+ " Minute is " +c+ " Second is " +a);

}
}

