/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;
import java.util.*;
public class Calc 
{
    public static void main(String[] args) 
    {
        float a,b,c;
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter operation to do");
        op=sc.nextLine().charAt(0);
         System.out.println("Enter your number");
        a=sc.nextFloat();
        b=sc.nextFloat();
        if (op=='+')
        {
            
            c=a+b;
            System.out.println("Addition = " +c);
        } 
        else if(op=='-')
        {
            
            c=a-b;
            System.out.println("Substraction = " +c);
        }
        else if(op=='*')
        {
            
        c=a*b;
            System.out.println("Multiplication = " +c);
        }
        else
        {
            
        c=a/b;
            System.out.println("Division = " +c);
        }
      
    }
   
}
