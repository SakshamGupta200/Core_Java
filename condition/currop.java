/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;
import java.util.*;
public class currop 
{
    public static void main(String[] args) {
        int op;
    float doll,rup;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choise");
        op=sc.nextInt();
        if (op==1) 
        {
            System.out.println("Enter amount in $ ");
            doll=sc.nextFloat();
            doll=doll*74;
            System.out.println("rupees is " +doll);
        }
        else
        {
            System.out.println("Enter amount in Rupees");
            rup=sc.nextFloat();
            rup=rup/74;
            System.out.println("Dollar is " +rup);
        }
    }
    
    
}
