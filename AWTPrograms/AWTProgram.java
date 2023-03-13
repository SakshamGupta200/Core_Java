package AWTPrograms;

import java.awt.*;

public class AWTProgram {
    public static void main(String[] args) {
        Frame f=new Frame("My Window");
        Button b=new Button("Add");
        b.setBounds(50,100,100,80);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

}
