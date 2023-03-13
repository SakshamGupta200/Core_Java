package Stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        int i,n;
        String S;
        Scanner sc=new Scanner(System.in);
        Stack<String> st=new Stack<String>();
        System.out.println("Enter stack size : ");
        n= sc.nextInt();
        System.out.println("Enter Item");
        for (i=1;i<=n;i++){
            S=sc.next();
            st.push(S);
        }
        System.out.println(st);
        System.out.println("Using For each Loop");
        for(String a:st)
        {
            System.out.println(a);
        }
        System.out.println("Using Iterator");
        Iterator<String> itr=st.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("List Iterator");
        ListIterator<String> litr=st.listIterator();
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }
        System.out.println("Using forEach");
        st.forEach(data-> {System.out.println(data);});

    }
}
