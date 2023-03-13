/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;

import java.util.*;
public class Agecalc
{
    public static void main(String[] args) {
        int d1=17,m1=02,y1=2022, d2,m2,y2,d,m,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your dob");
        d2=sc.nextInt();
        m2=sc.nextInt();
        y2=sc.nextInt(); 
        if (d1>d2)
        {
            d=d1-d2;
        } 
        else 
        {
            d1=d1+30;
            m1=m1-1;
            d=d1-d2;
        }
        if(m1>m2)
        {
            m=m1-m2;
        }
        else
        {
            m1=m1+12;
            y1=y1-1;
            m=m1-m2;
        }
        y=y1-y2;
        System.out.println("Your age = " +y+ " year " +m+ " Month " +d+ " Day");
    }
}
