package Queue;

import java.util.PriorityQueue;

public class Queue1 {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();

        pq.add("Saksham");
        pq.add("Ankit");
        pq.add("Javed");
        pq.add("Shyam");
        pq.add("Sunder");
        System.out.println(pq);
        /*for (String S:pq) {
            System.out.println(S);
        }
        Iterator<String> itr=pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        System.out.println("Head element = "+ pq.element());
        System.out.println("Peak element = "+ pq.peek());
        pq.remove();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}
