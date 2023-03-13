/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int n,a,b=0,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        c=n;
        while (n!=0) {
            a=n%10;
            b=(b*10)+a;
            n=n/10;
            
        }
        if (b==c) {
            System.out.println("palindome");
        } else {
            System.out.println("not palindrome");
        }
    }
    
}
