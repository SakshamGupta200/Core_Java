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
public class Sparce {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int i,j,a=0,b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix elements : ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if (arr[i][j]==0) {
                    a++;
                } 
                else {
                    b++;
                }
            }
        }
        if (a>b) {
            System.out.println("Sparce mat");
        } else {
            System.out.println("Non sparce mat");
        }
    }
}
