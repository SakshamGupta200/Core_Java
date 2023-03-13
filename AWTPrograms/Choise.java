package AWTPrograms;

import java.awt.*;

public class Choise {
    public static void main(String[] args) {
        Frame f=new Frame("Choise");
        Choice c=new Choice();
        c.setBounds(150,200,130,50);
        c.add("Varanasi");
        c.add("Bhadohi");
        c.add("Mirzapur");
        c.add("Gorakhpur");
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
