package AWTPrograms;

import java.awt.*;

public class AWTList {
    public static void main(String[] args) {
        Frame f=new Frame("List");
        List l=new List(5);
        l.setBounds(150,200,150,50);
        l.add("Saksham");
        l.add("Raju");
        l.add("Samar");
        l.add("Amar");
        l.add("Ankit");
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
