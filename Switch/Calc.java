/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;
import java.lang.String;
import java.util.*;
public class Calc {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
         char op;
        System.out.println("Enter your operation :");
        op=sc.nextLine().charAt(0);
        System.out.println("Enter two integers :");
        a=sc.nextInt();
        b=sc.nextInt();
       
        switch(op)
        {
            case '+':
                c=a+b;
                System.out.println("Addition = " +c);
                break;
                case '-':
                c=a-b;
                System.out.println("Substraction = " +c);
                break;
                case '*' :
                c=a*b;
                System.out.println("Multiplication = " +c);
                break;
                case '/':
                c=a/b;
                System.out.println("Division = " +c);
                break;
                default:
                    System.out.println("error");
        }
    }
}
