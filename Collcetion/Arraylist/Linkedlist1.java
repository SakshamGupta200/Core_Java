package Collcetion.Arraylist;

import java.util.*;

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<Integer>();
        ll.add(100);
        ll.add(100);
        ll.add(100);
        ll.add(100);
        ll.add(100);
        System.out.println(ll);
        Iterator<Integer> ity= ll.iterator();
        while(ity.hasNext()) {
            System.out.println(ity.next());
        }
            ll.addFirst(20012);
        System.out.println(ll);
        ll.addLast(89646);
        System.out.println(ll);


    }
}
