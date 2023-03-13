package Collcetion.Arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist2 {
    public static void main(String[] args) {
        String S=new String();
        Scanner sc=new Scanner(System.in);
        int i,n;
        ArrayList <String> ar=new ArrayList<String>();
        System.out.println("Enter array size :");
        n= sc.nextInt();
        for (i=0;i<n;i++){
            S= sc.nextLine();
            ar.add(S);
        }
        System.out.println("My Strings are :");
        System.out.println(ar);
        Iterator itr=ar.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }
        Collections.sort(ar);
        System.out.println(ar);
        ar.remove(1);
        System.out.println(ar);
        ar.remove("Ram");
        System.out.println(ar);
        ar.removeAll(ar);
        System.out.println(ar);
    }
}
