/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.*;
public class Numcount {
    public static void main(String[] args) {
        int n,b=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        while (n!=0) {            
            int a=n%10;
              b=b+a;
              n=n/10;
           
        }
        System.out.println(b);
    }
    
}
