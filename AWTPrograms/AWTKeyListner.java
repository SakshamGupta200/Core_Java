package AWTPrograms;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AWTKeyListner extends Frame implements KeyListener {

    Label l;
    TextArea ta;
    AWTKeyListner() {
        l = new Label("Value = ");
        ta = new TextArea();
        l.setBounds(150, 50, 250, 50);
        ta.setBounds(210, 150, 300, 300);
        add(l);
        add(ta);
        ta.addKeyListener(this);
        setLayout(null);
        setVisible(true);
        setSize(700, 500);
    }

        public void keyPressed(KeyEvent e){
            //l.setText("Key Pressed");

        }
    public void keyReleased(KeyEvent e){
       String text=ta.getText();
       String[] words=text.split("\\s");
       l.setText("Words::"+words.length+"Character::"+text.length());
    }
    public void keyTyped(KeyEvent e){
        //l.setText("Key Typed");
    }

    public static void main(String[] args) {
        new AWTKeyListner();

    }
    }

