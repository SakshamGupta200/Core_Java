package AWTPrograms;

import java.awt.*;

public class AWTlabel {
    public static void main(String[] args) {
        Frame f=new Frame("My Window");
        Label l=new Label("Enter Your Name :");
        TextField tf=new TextField(" ");
      //  Font F=new Font("Segoe UI",F.ITALIC,20);
        tf.setBounds(160,170,120,30);
        l.setBounds(30,150,100,60);
        f.add(l);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
