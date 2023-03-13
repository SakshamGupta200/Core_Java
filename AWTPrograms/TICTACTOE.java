package AWTPrograms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TICTACTOE  {
    static int n=0;
    static String str;
    public static void main(String[] args) {
        Frame f =new Frame("TIC TAC TOE");
        Panel p=new Panel();
        Button b1=new Button();
        Button b2=new Button();
        Button b3=new Button();
        Button b4=new Button();
        Button b5=new Button();
        Button b6=new Button();
        Button b7=new Button();
        Button b8=new Button();
        Button b9=new Button();
        b1.setBounds(150,150,50,50);
        b2.setBounds(210,150,50,50);
        b3.setBounds(270,150,50,50);
        b4.setBounds(150,210,50,50);
        b5.setBounds(210,210,50,50);
        b6.setBounds(270,210,50,50);
        b7.setBounds(150,270,50,50);
        b8.setBounds(210,270,50,50);
        b9.setBounds(270,270,50,50);
        Label l=new Label("Tic-Tac-Toe");
        l.setBounds(170,350,100,50);
      p.setBounds(150,300,600,600);
        p.setVisible(true);
        p.setSize(400,400);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        f.add(p);
        f.add(l);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b1.getLabel().equals("") && n<9){
                    if (n%2==0){
                        str="X";
                        b1.setLabel("X");
                    } else {
                        str="O";
                        b1.setLabel("O");
                    }
                    n++;
                }
                if(b2.getLabel().equals(str) && b3.getLabel().equals(str))
                {
                    l.setText("Player "+str+" is won ");
                } else if (b4.getLabel().equals(str) && b7.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }
                else if (b5.getLabel().equals(str) && b9.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }
                else if(n==9)
                {
                    l.setText("Game drawn !Play again");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b2.getLabel().equals("") && n<9){
                    if (n%2==0){
                        str="X";
                        b2.setLabel("X");
                    } else {
                        str="O";
                        b2.setLabel("O");
                    }
                    n++;
                }
                if(b1.getLabel().equals(str) && b3.getLabel().equals(str))
                {
                    l.setText("Player "+str+" is won ");
                } else if (b5.getLabel().equals(str) && b8.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }

                else if(n==9)
                {
                    l.setText("Game drawn !Play again");
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b3.getLabel().equals("") && n<9){
                    if (n%2==0){
                        str="X";
                        b3.setLabel("X");
                    } else {
                        str="O";
                        b3.setLabel("O");
                    }
                    n++;
                }
                if(b1.getLabel().equals(str) && b2.getLabel().equals(str))
                {
                    l.setText("Player "+str+" is won ");
                } else if (b6.getLabel().equals(str) && b9.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }
                else if (b5.getLabel().equals(str) && b7.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }
                else if(n==9)
                {
                    l.setText("Game drawn !Play again");
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b4.getLabel().equals("") && n<9){
                    if (n%2==0){
                        str="X";
                        b4.setLabel("X");
                    } else {
                        str="O";
                        b4.setLabel("O");
                    }
                    n++;
                }
                if(b1.getLabel().equals(str) && b7.getLabel().equals(str))
                {
                    l.setText("Player "+str+" is won ");
                } else if (b5.getLabel().equals(str) && b6.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }

                else if(n==9)
                {
                    l.setText("Game drawn !Play again");
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b5.getLabel().equals("") && n<9){
                    if (n%2==0){
                        str="X";
                        b5.setLabel("X");
                    } else {
                        str="O";
                        b5.setLabel("O");
                    }
                    n++;
                }
                if(b1.getLabel().equals(str) && b9.getLabel().equals(str))
                {
                    l.setText("Player "+str+" is won ");
                } else if (b2.getLabel().equals(str) && b8.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }
                else if (b3.getLabel().equals(str) && b7.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                } else if (b4.getLabel().equals(str) && b6.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won");
                } else if(n==9)
                {
                    l.setText("Game drawn !Play again");
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b6.getLabel().equals("") && n<9){
                    if (n%2==0){
                        str="X";
                        b6.setLabel("X");
                    } else {
                        str="O";
                        b6.setLabel("O");
                    }
                    n++;
                }
                if(b3.getLabel().equals(str) && b9.getLabel().equals(str))
                {
                    l.setText("Player "+str+" is won ");
                } else if (b4.getLabel().equals(str) && b5.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }

                else if(n==9)
                {
                    l.setText("Game drawn !Play again");
                }
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b7.getLabel().equals("") && n<9){
                    if (n%2==0){
                        str="X";
                        b7.setLabel("X");
                    } else {
                        str="O";
                        b7.setLabel("O");
                    }
                    n++;
                }
                if(b1.getLabel().equals(str) && b4.getLabel().equals(str))
                {
                    l.setText("Player "+str+" is won ");
                } else if (b3.getLabel().equals(str) && b5.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }
                else if (b8.getLabel().equals(str) && b9.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }
                else if(n==9)
                {
                    l.setText("Game drawn !Play again");
                }
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b8.getLabel().equals("") && n<9){
                    if (n%2==0){
                        str="X";
                        b8.setLabel("X");
                    } else {
                        str="O";
                        b8.setLabel("O");
                    }
                    n++;
                }
                if(b7.getLabel().equals(str) && b9.getLabel().equals(str))
                {
                    l.setText("Player "+str+" is won ");
                } else if (b2.getLabel().equals(str) && b5.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }

                else if(n==9)
                {
                    l.setText("Game drawn !Play again");
                }
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b9.getLabel().equals("") && n<9){
                    if (n%2==0){
                        str="X";
                        b9.setLabel("X");
                    } else {
                        str="O";
                        b9.setLabel("O");
                    }
                    n++;
                }
                if(b3.getLabel().equals(str) && b6.getLabel().equals(str))
                {
                    l.setText("Player "+str+" is won ");
                } else if (b1.getLabel().equals(str) && b5.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }
                else if (b7.getLabel().equals(str) && b8.getLabel().equals(str)) {
                    l.setText("Player "+str+" is won ");
                }
                else if(n==9)
                {
                    l.setText("Game drawn !Play again");
                }
            }
        });
    }

}
