package TwoDArray;
import java.util.Scanner;
public class matmulti {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        int i,j,k;
        Scanner S= new Scanner(System.in);
        System.out.println("Enter first matrix :");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                arr[i][j]=S.nextInt();
            }
        }
        System.out.println("Enter second matrix :");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                arr1[i][j]=S.nextInt();
            }
        }
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                arr2[i][j]=0;
                for (k=0;k<3;k++)
                {
                  arr2[i][j]+=arr[i][k]*arr1[k][j];
                }

            }
        }
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(arr2[i][j] +"  \t");
            }
            System.out.println("");
        }
    }
}
