package Set;

import java.util.HashSet;

class Book{
    int book_id;
    String book_name;
    int price;
    Book(int book_id,String book_name,int price){
        this.book_id=book_id;
        this.book_name=book_name;
        this.price=price;

    }
}
public class Hashset3 {
    public static void main(String[] args) {
        HashSet<Book> ht=new HashSet<Book>();
        Book b1=new Book(111,"c++",550);
        Book b2=new Book(112,"ds",500);
        Book b3=new Book(113,"c",650);
        ht.add(b1);
        ht.add(b2);
        ht.add(b3);
        System.out.println("Book Details :");
        for (Book b:ht) {
            System.out.println(b.book_id+" , "+b.book_name+" , "+b.price);
        }

    }
}
