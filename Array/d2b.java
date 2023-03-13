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
public class d2b {
    public static void main(String[] args) {
        int dec,i=0,j;
        int[] num=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Decimal Number");
        dec=sc.nextInt();
        while(dec>0)
        {
            num[i]=dec%2;
            dec=dec/2;
            i++;
        }
        System.out.print("Binary=");
        for(j=i-1;j>=0;j--)
        {
            System.out.print(num[j]);  
        }
    }
}
