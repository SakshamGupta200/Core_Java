/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.*;
public class Table {
    public static void main(String[] args) {
        int a,i;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number");
        a=sc.nextInt();
        for (i = 1;  i<= 10; i++) {
            System.out.println(a*i);

        }
    }
    
}
