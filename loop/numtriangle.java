/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;
public class numtriangle {
    public static void main(String[] args) {
        int n,i,j,k;
        System.out.println("Enter no. of row");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for ( i = 1; i <=n; i++) {
            for ( j =n ; j >=i; j--) {
                System.out.print(" ");
            }
            for ( j =1; j <=i;j++) {
                System.out.print(j);
            }
            k=j-1;
             for ( j =1; j <i;j++) {
                System.out.print(--k);
            }
            System.out.println("");
        }
    }
}
