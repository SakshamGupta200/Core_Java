package Mapping;

import java.util.*;

public class Hashmap2 {
    public static void main(String[] args) {
        int n;
        String K,V;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size :");
        n= sc.nextInt();
        Map mp=new HashMap();
        for (int i=0;i<n;i++){
            System.out.println("Enter Key :");
            K= sc.next();
            System.out.println("Enter Value :");
            V= sc.next();
            mp.put(K,V);
        }
        Set s=mp.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }
}
