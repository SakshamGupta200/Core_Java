package AWTPrograms;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AWTMouse extends Frame implements MouseListener {
    Label l;
    AWTMouse(){
        addMouseListener(this);
        l=new Label();
        l.setBounds(150,150,200,30);
        add(l);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse clicked");
    }
    public void mouseEntered(MouseEvent e){
        l.setText("Mouse entered");
    }
    public void mouseExited(MouseEvent e){
        l.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e){
        l.setText("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("Mouse released");
    }

    public static void main(String[] args) {

    }
}
