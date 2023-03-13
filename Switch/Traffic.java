/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

import java.util.Scanner;


public class Traffic {
    public static void main(String[] args) {
        char signal;
        System.out.println("Enter your signal :");
        Scanner sc=new Scanner(System.in);
        signal=sc.nextLine().charAt(0);
        switch(signal)
        {
            case 'R':
                System.out.println("STOP");
                break;
            case 'G':
                System.out.println("GO");
                break;
            case 'Y':
                System.out.println("WAIT");
                break;
             default:
                 System.out.println("Invalid ");
        }
    }
}
