/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;
import java.util.*;

public class Currency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
          int amt,note;
          System.out.println("Enter amount ");
          amt=sc.nextInt();
          if (amt>=2000)
          {
            note=amt/2000;
            amt=amt%2000;
              System.out.println("2000 X "+note);
              
              
          }
          if (amt>=1000)
            {
                note=amt/1000;
                amt=amt%1000;
                System.out.println("1000 X "+note);
            }
          if (amt>=500)
          {
            note=amt/500;
            amt=amt%500;
              System.out.println("500 X "+note);
          }
          if (amt>=200)
          {
            note=amt/200;
            amt=amt%200;
              System.out.println("200 X "+note);
          }
          if (amt>=100)
          {
            note=amt/100;
            amt=amt%100;
              System.out.println("100 X "+note);
          }
          if (amt>=50)
          {
            note=amt/50;
            amt=amt%50;
              System.out.println("50 X "+note);
          }
          if (amt>=20)
          {
            note=amt/20;
            amt=amt%20;
              System.out.println("20 X "+note);
          }
          if (amt>=10)
          {
            note=amt/10;
            amt=amt%10;
              System.out.println("10 X "+note);
          }
    }
    
}
