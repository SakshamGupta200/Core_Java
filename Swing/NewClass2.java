package Swing;

import javax.swing.*;

public class NewClass2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TabbedPane");
        JTextArea textArea = new JTextArea();
        JTabbedPane pan = new JTabbedPane();
        textArea.setBounds(150,150,300,300);
        JPanel panel = new JPanel();

        panel.add(textArea);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        pan.setBounds(150,150,300,300);
        pan.add("Paint",panel);
        pan.add("tant",panel1);
        pan.add("tank",panel2);
        frame.add(pan);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
