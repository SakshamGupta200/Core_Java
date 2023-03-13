/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;
public class rhombus {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter no. of row");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    
        for (int i = 0; i < n; i++) {
            for (int j =n;j>i; j--) {
                System.out.print(" ");
            }
            for (int j =1;j<=i; j++) {
                 if((i==1|i==n)||(j==1||j==i))
                System.out.print("* ");
                 else
                     System.out.print("  ");
            }
            System.out.println("");
    }
            for (int i = n; i >0 ; i--) {
            for (int j =n;j>i; j--) {
                System.out.print(" ");
            }
            for (int j =1;j<=i; j++) {
                 if((j==1||j==i))
                System.out.print("* ");
                 else
                     System.out.print("  ");
            }
            System.out.println("");
    }
}
}
