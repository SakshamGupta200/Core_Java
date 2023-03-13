package Set;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 {
    public static void main(String[] args) {
        TreeSet<String> tree=new TreeSet<String>();
        tree.add("Ankit");
        tree.add("Saksham");
        tree.add("Rahul");
        tree.add("Kunal");
        tree.add("Parag");
        tree.add("Pankaj");
        System.out.println(tree);
        for (String S:tree) {
            System.out.print(S);

        }
        System.out.println("list of names in Ascending Order");
        Iterator i=tree.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("list of names in Descending Order");
        Iterator I=tree.descendingIterator();
        while (I.hasNext())
        {
            System.out.println(I.next());
        }
    }
}
