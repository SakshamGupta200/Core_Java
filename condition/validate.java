/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;
import java.util.Scanner;
public class validate 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S;
        String S1;
          System.out.println("Enter your userid & Pass");
          S=sc.nextLine();
          S1=sc.nextLine();
        if(S.equals("Saksham") && S1.equals("Gupta"))
        {
            System.out.println("Login successful");
        }
        else
        {
            System.out.println("Login failed");
        }
    }
}
