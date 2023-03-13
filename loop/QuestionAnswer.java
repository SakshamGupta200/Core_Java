/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;
public class QuestionAnswer {
    public static void main(String[] args) {
        String Ques, Ans;
        int n=1;
        Scanner S =new Scanner(System.in);
        
         do {  
             System.out.println("favourite movie");
        
        Ans=S.nextLine();
        if(Ans.equals("harry potter"))
        {
            n=0;
        }
        } while(n!=0);
         System.out.println("correct ans");
    }
}

