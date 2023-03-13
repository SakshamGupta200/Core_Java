package Mapping;

import java.util.Map;
import java.util.TreeMap;

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
public class Treemap2 {
    public static void main(String[] args) {
        TreeMap<Integer, Book1> TM = new TreeMap<Integer, Book1>();
        Book1 b1=new Book1(111, "c++" ,  550);
        Book1 b3=new Book1(112, "php" ,  750);
        Book1 b2=new Book1(113, "java" ,  1050);

        TM.put(1,b1);
        TM.put(2,b2);
        TM.put(3,b3);
        for (Map.Entry <Integer,Book1> M :TM.entrySet()) {
            Book1 b=M.getValue();
            System.out.println(M.getKey()+" , "+ b.book_id +" , "+ b.price+" ,"+ b.book_name);
        }
    }
}
