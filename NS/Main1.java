package NS;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = S.length();

        for (int i = 0; i < n; i++){
            if (hm.containsKey(S.charAt(i)) == true){
                int freq = hm.get(S.charAt(i));
                hm.put(S.charAt(i), freq+1);
            }else{
                hm.put(S.charAt(i), 1);
            }
        }
        int ans = -1;
        for (int i=0; i<n; i++){
            if (hm.get(S.charAt(i))==1){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
