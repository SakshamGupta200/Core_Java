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
public class MaxMin {
    public static void main(String[] args) {
        int[] num=new int[10];
        int i , max,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 Numbers::");
        for(i=0;i<5;i++)
        {
          num[i]=sc.nextInt();
        }
        max=num[0];
        System.out.println("My Array List::");
        for(i=0;i<5;i++)
                {
                    if(max<num[i])
                        max=num[i];
                    System.out.println("num["+i+"]="+num[i]);  
                }
         System.out.println(max+" is maximum");
         min=num[0];
         for(i=0;i<5;i++)
                {
                    if(min>num[i])
                        min=num[i];
                    System.out.println("num["+i+"]="+num[i]);  
                }
         System.out.println(min+" is minimum");
    }
}
