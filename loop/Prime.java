/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int a,b=0;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        for (int i = 1; i <=a/2 ; i++) {
            if (a%i==0) {
                b++;
            } 
            
        }
        if (b==1) {
            System.out.println(a+" is prime");
        } else {
            System.out.println(a+" is not prime");
        }
    }
}
