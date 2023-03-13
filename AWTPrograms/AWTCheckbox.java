package AWTPrograms;

import java.awt.*;

public class AWTCheckbox {
    public static void main(String[] args) {
        Frame f=new Frame("Chechbox");
        Checkbox cb1=new Checkbox("Male",true);
        Checkbox cb2=new Checkbox("Female");
        Checkbox cb3=new Checkbox("Other");
        cb1.setBounds(50,150,120,20);
        cb2.setBounds(50,200,120,20);
        cb3.setBounds(50,250,120,20);
      f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
