package Basic;

import static java.lang.Math.sqrt;

public class Quadratric {
    public static void main(String[] args) {
        int n=56;
        long m,r,val,ans=-1,l=1;
       // Scanner sc=new Scanner(System.in);
       // n=sc.nextLong();
        r= (long) sqrt(n);
        while(l <= r){
            m=(l+r)/2;
            val=m*m + 3*m;
            if(val==n){
                ans=m;
                break;
            }
            if(val<n){
                l=m+1;
            }
            else
            {
                r=m-1;
            }
            System.out.println(l);
        }
    }
}


    /* long long int n;
             cin >> n;
             long long int l = 1, r = sqrt(n), ans = -1;
             while(l <= r){
             long long int m = (l + r)/2;
             long long int val = m*m + 3*m;
             if(val == n){
             ans = m;
             break;
             }
             if(val < n){
        l = m + 1;
        }
        else r = m - 1;
        }
        cout << ans;
        return 0;*/