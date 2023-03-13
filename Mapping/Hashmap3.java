package Mapping;

import java.util.*;

public class Hashmap3 {

    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();
        int n;
        String K,V;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size :");
        n= sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Enter Key :");
            K= sc.next();
            System.out.println("Enter Value :");
            V= sc.next();
            hm.put(K,V);
        }
        Set s=hm.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
        hm.putIfAbsent("apple","sev");
        System.out.println(hm);
        HashMap<String, String> hm1=new HashMap<>();
        hm1.putAll(hm);
        System.out.println(hm1);
        hm1.remove("pomegranate");
        System.out.println(hm1);
        hm1.replace("apple","kela");
        System.out.println(hm1);
        hm1.replaceAll((k,v)->"Saksham");
        System.out.println(hm1);
    }

}
