package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewClass {
    public static void main(String[] args) {
        JFrame frame=new JFrame("BG & FG Change" );
        JTextArea textArea=new JTextArea();
        JButton bg =new JButton("Background");
        JButton fg =new JButton("Foreground");

        textArea.setBounds(150,120,250,200);
        bg.setBounds(150,340,90,20);
        fg.setBounds(260,340,90,20);

        frame.add(textArea);
        frame.add(bg);
        frame.add(fg);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
        bg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color C=JColorChooser.showDialog(bg,"Choose",Color.CYAN);
                textArea.setBackground(C);
            }
        });
        fg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color C=JColorChooser.showDialog(fg,"Choose",Color.CYAN);
                textArea.setForeground(C);
            }
        });
    }
}
