package AWTPrograms;

import java.awt.*;

public class AWTPanel {
    public static void main(String[] args) {
        Frame f=new Frame("Panel");
        Panel p=new Panel();
        p.setBounds(150,200,200,200);

        p.setBackground(Color.CYAN);
        Button b=new Button("Home");
        b.setBounds(160,210,50,50);
        TextField tf=new TextField("hii");
        tf.setBounds(200,280,100,100);

        p.add(b);
        p.add(tf);

        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
    }
}
