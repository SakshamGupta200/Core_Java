package AWTPrograms;

import java.awt.*;

public class AWTMenu {
    public static void main(String[] args) {
        Frame f=new Frame("Main Menu");
        Button b=new Button("Home");
        Button b1=new Button("About");
        Button b2=new Button("Contact");
        Button b3=new Button("Course");
        Button b4=new Button("Download");
        Button b5=new Button("Exit");
        b.setBounds(50,200,100,20);
        b1.setBounds(50,240,100,20);
        b2.setBounds(50,280,100,20);
        b3.setBounds(50,320,100,20);
        b4.setBounds(50,360,100,20);
        b5.setBounds(50,400,100,20);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setSize(200,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}
