package AWTPrograms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTAdopter {
    Frame f;
    Button b;
    AWTAdopter(){
        f=new Frame("Adopter");
        b=new Button("Click to close the window");
        b.setBounds(150,150,250,20);
        f.add(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        AWTAdopter ad =new AWTAdopter();
    }
}
