/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;

import java.util.*;

public class Bill {

    public static void main(String[] args) {
        int unit,rate=1,bill,sur=0;
        
        System.out.println("Enter unit");
        Scanner sc = new Scanner(System.in);
        unit = sc.nextInt();
        if (unit < 200) {
            rate=4;
            //System.out.println("rupees = " + unit * 4);
        } else if (unit >= 200 && unit < 400) {
            rate=6;
           // System.out.println("rupees = " + unit * 6);
        } else if (unit >= 400 && unit < 600) {
            rate=8;
            //System.out.println("rupees = " + unit * 8);
        } else {
            rate=10;
            //System.out.println("rupees = " + unit * 10);
        }
        bill=unit*rate;
        System.out.println("************bill****************");
        System.out.println("Bill = " +bill);
        if (bill>=500) 
            {
                sur=(bill*20)/100;
            }
            System.out.println("**********Surcharge************");
            System.out.println("Surcharge = " +sur);
        bill=bill+sur;
        
        System.out.println("final bill = " +bill);
    System.out.println("*************************************************");
    }
}
