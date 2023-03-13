/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.*;
/**
 *
 * @author Saksham
 */
public class oned {
    public static void main(String[] args) {
        int[] num=new int[10];
        int i;
        Scanner sc=new Scanner(System.in);
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
        
    }
}
