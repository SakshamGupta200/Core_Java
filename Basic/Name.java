package Basic;

import java.util.Scanner;
class Name
{
public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
String S;
char grad;
System.out.println("Enter your name");
S=sc.nextLine();

System.out.println("Enter your grade");
grad=sc.nextLine().charAt(0);
System.out.println("Your name " +S+ " and grad is " +grad);

}
}

