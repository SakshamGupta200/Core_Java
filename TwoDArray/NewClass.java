/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDArray;

import java.util.Scanner;

/**
 *
 * @author Saksham
 */
public class NewClass {
   public static void main(String args[]){  
//creating a matrix  
int original[][]=new int[3][3];   
Scanner sc=new Scanner(System.in);
       System.out.println("Enter matrix elements :");
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j<3; j++) {
               original[i][j]=sc.nextInt();
           }
       }
//creating another matrix to store transpose of a matrix  
int transpose[][]=new int[3][3];  //3 rows and 3 columns  
    
//Code to transpose a matrix  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
transpose[i][j]=original[j][i];  
}    
}    
  
System.out.println("Printing Matrix without transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(original[i][j]+" ");    
}    
System.out.println();//new line    
}    
System.out.println("Printing Matrix After Transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(transpose[i][j]+" ");    
}    
System.out.println();//new line    
}    
}
}
