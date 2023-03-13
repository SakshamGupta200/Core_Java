package Mapping;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        String K,V;
        int n,i;
        Scanner sc=new Scanner(System.in);
        TreeMap<String, String> TM=new TreeMap<>();
        System.out.println("Enter size :");
        n= sc.nextInt();
        for (i=1;i<=n;i++){
            System.out.println("Enter Key :");
            K= sc.next();
            System.out.println("Enter Value :");
            V= sc.next();
            TM.put(K,V);
        }
        System.out.println("my data");
        for(Map.Entry<String,String> m:TM.entrySet())
        {
            System.out.println(m.getKey()+"<=>"+m.getValue());
        }
        System.out.println(TM);
        System.out.println(TM.descendingMap());
        System.out.println(TM.headMap("112"));
        System.out.println(TM.tailMap("111"));
        System.out.println(TM.subMap("111","115"));
        System.out.println(TM.remove("114"));
        System.out.println(TM);
    }
}
