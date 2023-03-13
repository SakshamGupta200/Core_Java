package Swing;

import javax.swing.*;

public class NewClass1 extends JFrame {

    JProgressBar progress;
    int i=0;
    NewClass1()
    {

        progress = new JProgressBar(0,100);

        progress.setBounds(100,100,200,50);
        progress.setValue(0);
        progress.setStringPainted(true);
        add(progress);
        setSize(500,500);
        progress.setVisible(true);

        setLayout(null);
    }
    public void iterate() {
        while (i <= 100) {
            progress.setValue(i);
            i++;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
    public static void main(String[] args) {

     NewClass1 mm=  new NewClass1();
     mm.setVisible(true);
     mm.iterate();

        }


    }

