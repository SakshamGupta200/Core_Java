/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Typecasting;

import static java.lang.Integer.parseInt;

/**
 *
 * @author Saksham
 */
public class type {
    public static void main(String[] args) {
       int a=65,d;
       char b='c';
       float vc=89.67f;
       String str="500";
        System.out.println(a);
        System.out.println(b);
        System.out.println(vc);
        System.out.println(str);
        System.out.println("*********************Changed value is**************");
        b=(char)a;
        System.out.println(b);
        a=(int)vc;
        System.out.println(a);
        b=(char)vc;
        System.out.println(b);
       d= Integer.parseInt(str);
        System.out.println(d);
    }
}
