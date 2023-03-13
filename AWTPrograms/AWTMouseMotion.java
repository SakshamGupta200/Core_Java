package AWTPrograms;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class AWTMouseMotion extends Frame implements MouseMotionListener {
    Label l;
        AWTMouseMotion(){
            l=new Label();
            addMouseMotionListener(this);

            l.setBounds(150,150,200,30);
            add(l);
            setSize(500,500);
            setLayout(null);
            setVisible(true);

        }
        public void mouseDragged(MouseEvent m){
            Graphics g=getGraphics();
            g.setColor(Color.DARK_GRAY);
            g.fillOval(m.getX(),m.getY(),20,20);

        }
    public void mouseMoved(MouseEvent m){
    l.setText("x = "+m.getX()+" , y= "+m.getY());
    }

    public static void main(String[] args) {
        AWTMouseMotion amm=new AWTMouseMotion();
    }
}
