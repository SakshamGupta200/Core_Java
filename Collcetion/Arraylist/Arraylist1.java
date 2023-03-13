package Collcetion.Arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Arraylist1 {
    public static void main(String[] args) {
        int a,n,i;
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> ar=new ArrayList<>();
        System.out.println("Enter your array size :");
        n= sc.nextInt();
        for (i=0;i<n;i++){
            a=sc.nextInt();
            ar.add(a);
        }
        System.out.println("My Array List");
        Iterator<Integer> itr=ar.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }
        //2nd way
        for(int x:ar)
        {
            System.out.println(x);
        }
    }
}
