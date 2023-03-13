package NS;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

                 Scanner sc = new Scanner(System.in);
        int N, i, j, k;
        N=sc.nextInt();

        ArrayList <Integer> arr =new ArrayList<>();
        for (i=0;i<N-1;i++){
            arr.add(N);
        }
        //N = arr.length;
      //  N = N - 1;

        int pcount = 0, ncount = 0;
        i = 1;
        while (i <= N - 1) {
            if (arr.get(i) > 0) {
                pcount++;
            } else {
                ncount++;
            }
            i++;
        }
       /* System.out.println("pos " + pcount);
        System.out.println("neg " + ncount);*/
        int pos[]=new int[pcount];
        int neg[]=new int[ncount];

        for(i=0,j=0,k=0;i<N;i++){
            if(arr.get(i) <0 && j<=ncount){
                neg[j]= arr.get(i);
                j++;
            }
            if(arr.get(i) >0 && k<=pcount){
                pos[k]= arr.get(i);
                k++;
            }
        }
        int b[]=new int[N];
        for(i=0,j=0,k=0;i<N;i++){
            if(i%2==0 && j<=pcount){
                b[i]=pos[j];
                j++;
            }
            if(i%2!=0 && k<=ncount){
                b[i]=neg[k];
                k++;
            }
        }
        for(i=0;i<N;i++){
            System.out.print(b[i]+" ");
        }
    }
}

