package AWTPrograms;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AWTPrac extends Frame implements ItemListener {
    Label l;
    List list;
    Checkbox c1,c2;
    AWTPrac(){
    list=new List();
    l=new Label("Course : ");
    c1=new Checkbox("Java");
    c2=new Checkbox("Ruby");
    l.setBounds(150,150,200,50);
    c1.setBounds(150,210,50,50);
        c2.setBounds(210,210,50,50);
        list.setBounds(150,270,250,300);
        add(l);
        add(c1);
        add(c2);
        add(list);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        c1.addItemListener(this);
        c2.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e){
      if(e.getSource()==c1) {
          if (e.getStateChange() == 1)
          {
              l.setText(c1.getLabel());
          list.add(c1.getLabel());
      }
          else {
             list.remove(c1.getLabel());

          }
      }
      if (e.getSource()==c2) {
          l.setText("Ruby"+(e.getStateChange()==1?" checked":" unchecked"));
          list.add(c2.getLabel());
      }
    }

    public static void main(String[] args) {
        AWTPrac P = new AWTPrac();
    }
}
