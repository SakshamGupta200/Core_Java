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
public class arraysum {
     public static void main(String[] args) {
        int[] num=new int[10];
        int i , sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 Numbers::");
        for(i=0;i<5;i++)
        {
          num[i]=sc.nextInt();
        }
        System.out.println("My Array List::");
        for(i=0;i<5;i++)
                {
                    System.out.println("num["+i+"]="+num[i]);  
                    sum=sum+num[i];

                }
         System.out.println(sum);
         
    }
}
