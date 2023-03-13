package AWTPrograms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAction {
    public static void main(String[] args) {
        Frame f=new Frame("Action");
        TextField tf=new TextField();
        Button b=new Button("OK");
        tf.setBounds(150,100,150,30);
        b.setBounds(300,100,50,30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Saksham Gupta");
            }
        });

        f.add(tf);
        f.add(b);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
    }
}
