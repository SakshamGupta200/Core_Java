package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book>{
    int book_id;
    String book_name;
    int price;
    Book(int book_id,String book_name,int price){
        this.book_id=book_id;
        this.book_name=book_name;
        this.price=price;

    }
    public int compareTo(Book b)
    {
        if(book_id>b.book_id)
        {
            return  1;
        }
        else if(book_id<b.book_id)
        {
            return -1;
        }
        else {
            return  0;
        }
    }
}

public class Queue2 {
    public static void main(String[] args) {
        PriorityQueue<Book> pq= new PriorityQueue<Book>() ;
            Book b1 = new Book(111, "c++", 550);
            Book b2 = new Book(112, "ds", 500);
            Book b3 = new Book(113, "c", 650);
            pq.add(b1);
            pq.add(b2);
            pq.add(b3);
        System.out.println("Book Details :");
        for (Book b:pq) {
            System.out.println(b.book_id+" , "+b.book_name+" , "+b.price);
        }


    }
}
