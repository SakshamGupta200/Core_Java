package Swing;

import javax.swing.*;

public class Image   {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("E:\\My mobile backup\\New folder\\DCIM\\PhotoLab\\1.jpg");
        JFrame frame = new JFrame();
        JLabel label = new JLabel(image);
        label.setBounds(150,150,500,500);
        frame.add(label);
        frame.setSize(600,600);
        frame.setVisible(true);

    }
}
