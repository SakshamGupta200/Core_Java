package TwoDArray;
import java.util.*;
public class Jaggedarray {
    public static void main(String[] args) {
        int[][] jagged=new int[3][];
        jagged[0]=new int[4];
        jagged[1]=new int[2];
        jagged[2]=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first row elements");
        for(int i=0;i<4;i++)
        {
            jagged[0][i]=sc.nextInt();
        }
        System.out.println("Enter Second row elements");
        for(int i=0;i<2;i++)
        {
            jagged[1][i]=sc.nextInt();
        }
        System.out.println("Enter third row elements");
        for(int i=0;i<3;i++)
        {
            jagged[2][i]=sc.nextInt();
        }
        System.out.println("My Array");
/*
        for(int i=0;i<4;i++)
        {
            System.out.print(jagged[0][i]+"\t");
        }
        System.out.println();
        for(int i=0;i<2;i++)
        {
            System.out.print(jagged[1][i]+"\t");
        }
        System.out.println();
        for(int i=0;i<3;i++)
        {
            System.out.print(jagged[2][i]+"\t");
        }
        */
        for (int i=0; i<jagged.length; i++){
            for (int j=0; j<jagged[i].length;j++){
                System.out.print(jagged[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
