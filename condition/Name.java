/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;

import java.util.Scanner;
public class Name 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S,G;
        System.out.println("Enter your name & gender");
        S=sc.nextLine();
        G=sc.nextLine();
        if(G.equals("male")||G.equals("MALE"))
        {
            System.out.println("Mr."+S);
        }
        else
        {
              System.out.println("Miss."+S);
        }
    }
}
