package AWTPrograms;

import java.awt.*;
public class AWTForm {
    public static void main(String[] args) {
        Frame f=new Frame("Form");
        Label l=new Label("First Name :");
        TextField tf=new TextField(" ");
        Label l1=new Label("Middle Name :");
        TextField tf1=new TextField(" ");
        Label l2=new Label("Last Name :");
        TextField tf2=new TextField(" ");
        Label l3=new Label("Father's Name :");
        TextField tf3=new TextField(" ");
        Label l4=new Label("Mother's Name :");
        TextField tf4=new TextField(" ");
        Label l5=new Label("Email :");
        TextField tf5=new TextField(" ");
        Label l6=new Label("Mobile :");
        TextField tf6=new TextField(" ");

        Button b=new Button("Add Record");
        Button b1=new Button("Cancel");

        l.setBounds(30,150,100,60);
        l1.setBounds(360,150,100,60);
     l2.setBounds(700,150,100,60);
        l3.setBounds(30,200,100,60);
        l4.setBounds(30,250,100,60);
        l5.setBounds(30,300,100,60);
        l6.setBounds(30,350,100,60);
        tf.setBounds(140,150,220,30);
        tf1.setBounds(470,150,220,30);
        tf2.setBounds(810,150,150,30);
        tf3.setBounds(140,200,150,30);
        tf4.setBounds(140,250,150,30);
        tf5.setBounds(140,300,150,30);
        tf6.setBounds(140,350,150,30);
        b.setBounds(140,400,90,30);
        b1.setBounds(250,400,70,30);
        f.add(l);
       f.add(l1);
       f.add(l2);
       f.add(l3);
        f.add(l4);
        f.add(l5);
       f.add(l6);
        f.add(tf);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
        f.add(tf6);
f.add(b);
f.add(b1);
        f.setSize(990,500);
        f.setLayout(null);
        f.setVisible(true);
        Font font = new Font("Segeo UI", Font.BOLD,14);
        f.setFont(font);
        f.setBackground(Color.CYAN);
    }
}
