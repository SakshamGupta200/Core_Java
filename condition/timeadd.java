/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;
import java.util.*;
public class timeadd
{
    public static void main(String[] args) {
        int h=0,h1,h2,m=0,m1,m2,s=0,s1,s2;

    Scanner sc=new Scanner(System.in);
       System.out.println("Enter 1st hour,min,sec");
       h1=sc.nextInt();
       m1=sc.nextInt();
       s1=sc.nextInt();
        System.out.println("Enter 2nd hour,min,sec");
        h2=sc.nextInt();
        m2=sc.nextInt();
        s2=sc.nextInt();
        s=s1+s2;
        m=m1+m2;
        h=h1+h2;
        if(s>=60)
        {
            m=m+1;
            s=s-60;
        }
        if(m>=60)
        {
            h=h+1;
            m=m-60;
        }
        System.out.println("hour is " +h+ " min = " +m+ " sec = " +s );
    }
    
    
}
