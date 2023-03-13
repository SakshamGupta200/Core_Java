package NS1;

import java.util.Scanner;

public class Subarray {
    static int MaxSubarrayLength(int[] Arr, int N, int X){
        int left = -1;
        int right = 0;
        int sum = 0 ;
        for(int i = 0; i < N; i++){
            if ((Arr[i] % X) != 0){
                if(left == -1){
                    left = i;
                }
                right = i;
            }
            sum = sum + Arr[i];
        }
        if((sum % X) != 0){
            return N;
        }
        else if(left == -1){
            return -1;
        }
        else{
            int pre_len = left + 1;
            int suf_len = N - right;
            return N - Math.min(pre_len, suf_len);
        }
    }

    public static void main (String[] args) {
        // Your code here
        int N,X;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        N = sc.nextInt();
        System.out.println("Enter the element to check subarray:");
        X = sc.nextInt();
        System.out.println("Enter array elements :");
        int[] Arr = new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println(MaxSubarrayLength(Arr,N,X));
    }
}
