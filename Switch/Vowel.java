/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        char st;
        System.out.println("Enter any character :");
        Scanner sc=new Scanner(System.in);
        st=sc.nextLine().charAt(0);
        switch(st)
        {
            case 'A':
            case 'a':
                System.out.println(st+ " is Vowel");
                    break;
            case 'E':
            case 'e':
                System.out.println(st+ " is Vowel");
                    break;
                    case 'I':
            case 'i':
                System.out.println(st+ " is Vowel");
                    break;
                    case 'O':
            case 'o':
                System.out.println(st+ " is Vowel");
                    break;
                    case 'U':
            case 'u':
                System.out.println(st+ " is Vowel");
                    break;
                    default:
                        System.out.println(st+ " is consonent");
        }
    }
    
}
