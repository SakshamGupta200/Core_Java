package AWTPrograms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTSum {
    public static void main(String[] args) {
        Frame f=new Frame("Sum");
        Button b=new Button("Add");
        Label l1=new Label("First Number");
        Label l2=new Label("Second Number");
        Label l3=new Label("Result");
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        TextField tf3=new TextField();
        l1.setBounds(100,100,90,30);
        l2.setBounds(100,150,100,30);
        l3.setBounds(100,200,90,30);

        tf1.setBounds(210,100,90,30);
        tf2.setBounds(210,150,90,30);
        tf3.setBounds(210,200,90,30);

        b.setBounds(150,250,50,50);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1,s2,s3;
                int a,b,c;
                s1=tf1.getText();
                s2=tf2.getText();
                a=Integer.parseInt(s1);
                b=Integer.parseInt(s2);
                c=a+b;
                s3=Integer.toString(c);
                tf3.setText(s3);

            }
        });
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(b);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);

    }

}
