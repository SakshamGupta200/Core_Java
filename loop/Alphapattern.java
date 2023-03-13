/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/**
 *
 * @author Saksham
 */
import java.util.Scanner;
public class Alphapattern {
     public static void main(String[] args) {
        int i,j,n;
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for (i = 1; i<=n; i++) {
            for(j=1;j<=n;j++){
               
                System.out.print((char)(i+64));
            
            }
            System.out.println();
          
        }
    }
}
