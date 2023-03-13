package AWTPrograms;

import java.awt.*;


public class Puzzel1 {
    public static void main(String[] args) {
        Frame f=new Frame("Puzzle");
        Button b1=new Button("10");
        Button b2=new Button("7");
        Button b3=new Button("8");
        Button b4=new Button("9");
        Button b5=new Button("5");
        Button b6=new Button("1");
        Button b7=new Button("3");
        Button b8=new Button("14");
        Button b9=new Button("15");
        Button b10=new Button("11");
        Button b11=new Button("6");
        Button b12=new Button("13");
        Button b13=new Button("2");
        Button b14=new Button("4");
        Button b15=new Button("12");
        Button b16=new Button();


        b1.setBounds(150,150,50,50);
        b2.setBounds(210,150,50,50);
        b3.setBounds(270,150,50,50);
        b4.setBounds(330,150,50,50);
        b5.setBounds(150,210,50,50);
        b6.setBounds(210,210,50,50);
        b7.setBounds(270,210,50,50);
        b8.setBounds(330,210,50,50);
        b9.setBounds(150,270,50,50);
        b10.setBounds(210,270,50,50);
        b11.setBounds(270,270,50,50);
        b12.setBounds(330,270,50,50);
        b13.setBounds(150,330,50,50);
        b14.setBounds(210,330,50,50);
        b15.setBounds(270,330,50,50);
        b16.setBounds(330,330,50,50);



        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }
}
