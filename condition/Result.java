/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;

import java.util.*;
public class Result 
{
    public static void main(String[] args) {
        int m1,m2,m3,m4;
        float per;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        per=(m1+m2+m3+m4)/4;
        System.out.println(per);
        if (per<50) 
        {
            System.out.println("fail");
        }
        else if (per>=50 && per<=54) 
        {
            System.out.println("D Grade");
        } else if (per>=55 && per<=64) 
        {
            System.out.println("C Grade");
        }   else if (per>=65 && per<=74) 
        {
            System.out.println("B Grade");
        }   else if (per>=75 && per<=84) 
        {
            System.out.println("A Grade");
        }   else if (per>=85) 
        {
            System.out.println("S Grade");
        }
    }
}
