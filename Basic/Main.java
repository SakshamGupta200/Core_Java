package Basic;

import java.util.Scanner;
class Main {
    public static void main (String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        n=n*4+1;
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            x^= a;
            y^= b;
        }
        System.out.print(x+" "+y);

    }
}