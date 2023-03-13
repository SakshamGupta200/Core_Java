/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

//import java.util.*;
public class fizzbuzz {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FIZZBUZZ");
            }
           
            
           else if(i%3==0){
                System.out.println("FIZZ");
            }
           
   
           else if (i%5==0) {
                System.out.println("BUZZ");
                
            }
           else 
           {
               System.out.println(i);
           }
           
            
           
            
        }
    }
    
}
