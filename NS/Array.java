package NS;

import java.util.Scanner;

public class Array {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int N,i,j,k;
        N=sc.nextInt();
        int []arr = new int[N];
        int b[]=new int[N];
        for(i=1;i<=N;i++){
            arr[i]=sc.nextInt();
        }
        int pcount=0,ncount=0;
        for(i=1;i<=N;i++){
            if(arr[i]>0){
                pcount++;
            }
            else{
                ncount++;
            }
        }
        int pos[]=new int[pcount];
        int neg[]=new int[ncount];

        for(i=1,j=1,k=1;i<=N;i++){
            if(arr[i]<0 && j<=ncount){
                neg[j]=arr[i];
                j++;
            }
            if(arr[i]>0 && k<=pcount){
                pos[k]=arr[i];
                k++;
            }
        }
        for(i=1,j=1,k=1;i<=N;i++){
            if(i%2==0 && j<=pcount){
                b[i]=pos[j];
                j++;
            }
            if(i%2!=0 && k<=ncount){
                b[i]=neg[k];
                k++;
            }
        }
        for(i=1;i<=N;i++){
            System.out.print(b[i]+" ");
        }
    }
}

