/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author Saksham
 */
public class prime {
    public static void main(String[] args) {
          int num[]=new int[10];
        int i,s,j,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        s=sc.nextInt();
        System.out.println("Enter array elements");
        for ( i = 0; i < s; i++) {
            num[i]=sc.nextInt();
        }
        System.out.print("All prime numbers are :");
        for ( i = 0; i < s; i++) {
            j=2;
            p=1;
            while (j<num[i] ) {                
                if (num[i]%j==0) {
                    p=0;
                    break;
                }
                j++;
            }
            if (p==1) {
                System.out.print(" "+num[i]);
            }
        }
        
    }
}

