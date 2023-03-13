/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;

import java.util.*;
public class Greater {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three numbers :");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a>b) {
            if (a>c) {
                System.out.println(a+ " is greater");
            }
            else
            {
                System.out.println(c+ " is greater");
            }
        } else {
            if (b>c) {
                System.out.println(b+ " is greater");
            } else {
                System.out.println(c+ " is greater");
            }
        }
 
    }
}
