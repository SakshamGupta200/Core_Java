/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;

 import java.util.*;
public class PL 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cp,sp,profit,loss;
        System.out.println("Enter selling price & Cost price");
        sp=sc.nextInt();
        cp=sc.nextInt();
        if(sp>cp)
        {
            profit=sp-cp;
            System.out.println("Profit = " + profit);
        }
        else if(cp>sp)
        {
            loss = sp-cp;
            System.out.println("Loss = " + loss);
        }
        else
        {
            System.out.println("No profit & no loss");
        }
    }
    
}
