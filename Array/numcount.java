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
public class numcount{
    public static void main(String[] args) {
        int[] num=new int[10];
        int i,n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.println("Enter 10 Numbers::");
        for(i=0;i<10;i++)
        {
          num[i]=sc.nextInt();
        }
        System.out.println("My Array List::");
        for(i=0;i<10;i++)
                {
                    System.out.println("num["+i+"]="+num[i]);   
                }
        for(i=0;i<10;i++)
        {
            if (n==num[i]) {
                        count++;
                    }
                  
        }
           System.out.println(count);  
                }
    }

