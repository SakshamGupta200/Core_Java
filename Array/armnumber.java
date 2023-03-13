/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.Scanner;

public class armnumber {
    public static void main(String[] args) {
        int arr[]=new int[20];
        int i,j,n,c;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter 10 array elements :");
        for(i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<10;i++){
            n=arr[i];
            c=0;
            //armstron
            while (n>0) {                
                j=n%10;
                c=c+(j*j*j);
                n=n/10;
            }
            if (c==arr[i]) {
                System.out.println(arr[i]+" is armstrong");
            }
            else{
                System.out.println(arr[i]+" is not armstrong");
            }
        }
    }
}
