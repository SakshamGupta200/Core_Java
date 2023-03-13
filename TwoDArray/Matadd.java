package TwoDArray;
import java.util.Scanner;
public class Matadd {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array elements : ");
        for (i=0;i<3;i++){
            for (j = 0;j  <3 ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("My array is :");
        for (i = 0; i < 3; i++) {
            for (j=0;j<3;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("My upper triangular is :");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                if(i>j)
                {
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j] +" \t");
            }
            System.out.println();
        }
        System.out.println("My lower triangular is :");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                if(i<j)
                {
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j] +" \t");
            }
            System.out.println();
        }
    }
}