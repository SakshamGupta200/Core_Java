package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Book1{
    int book_id;
    String book_name;
    int price;
    Book1(int book_id,String book_name,int price){
        this.book_id=book_id;
        this.book_name=book_name;
        this.price=price;

    }
}
public class Treeset3 {
    public static void main(String[] args) {
        TreeSet<Book1> ht=new TreeSet<Book1>();
        Book1 b1=new Book1(111,"c++",550);
        Book1 b2=new Book1(112,"ds",500);
        Book1 b3=new Book1(113,"c",650);
        ht.add(b1);
        ht.add(b2);
        ht.add(b3);
        System.out.println("Book Details :");
        Iterator<Book1> itr=ht.descendingIterator();
       while(itr.hasNext())
       {
           Book1 b=(Book1)itr.next();
           System.out.println(b.book_id+","+b.book_name+","+b.price);
       }

    }
}

