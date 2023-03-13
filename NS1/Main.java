package NS1;

import java.util.Scanner;

public class Main {
    public static boolean binarySearch(int ar[],int k){
        int i=0;
        int j=ar.length-1;
        while(i<=j){
            System.out.println("i: "+i+" j: "+j);
            int m = (i+j)/2;
            if(ar[m]==k){
                return true;
            }
            else if(ar[m]<k){
                i = m+1;
            }
            else{
                j = m-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if(binarySearch(ar,k)){
            System.out.println("It is present");
        }
        else{
            System.out.println("It is not present");
        }
    }

}
