import java.io.*;
import java.util.*;

public class boundarytreversal {
	public static void print(int ar[][]){
		for(int i=0;i<ar[0].length;i++){
			System.out.print(ar[0][i]+" ");
		}
		for(int i=1;i<ar.length;i++){
			System.out.print(ar[i][ar[0].length-1]+" ");
		}
		for(int i=ar[0].length-2;i>=0;i--){
			System.out.print(ar[ar.length-1][i]+" ");
		}
		for(int i=ar.length-2;i>0;i--){
			System.out.print(ar[i][0]+" ");
		}	
	}


	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ar[][] = new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				ar[i][j] = sc.nextInt();
			}
		}
		print(ar);
	}
}
