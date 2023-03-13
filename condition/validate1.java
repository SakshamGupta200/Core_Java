/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;
import java.util.*;
public class validate1 
{
    public static void main(String[] args) {
        String S,S1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter userid & Password");
        S=sc.nextLine();
        S1=sc.nextLine();
        if (S.equals("Saksham"))
        {
            if (S1.equals("Gupta"))
            {
                System.out.println("Successful");
            }
            else{
                System.out.println("Try again");
            }
        }
        else{
            System.out.println("invalid userid or password");
        }
    }
}
