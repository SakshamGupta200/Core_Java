package Set;

import java.util.Scanner;
import java.util.TreeSet;

public class Treeset2 {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of list :");
        TreeSet<String> tree=new TreeSet<String>();
        n= sc.nextInt();
        for (i=1;i<=n;i++){
            tree.add(sc.next());
        }
        System.out.println("list is :");
        System.out.println(tree);

        //System.out.println(tree.pollFirst());
       // System.out.println(tree.pollLast());

        System.out.println(tree.descendingSet());
        System.out.println(tree.headSet("ankit",true));
        System.out.println(tree.tailSet("bjp"));
        System.out.println(tree.subSet("aniket",false,"bjp",true));
    }
}
