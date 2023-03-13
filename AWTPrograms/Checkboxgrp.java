package AWTPrograms;

import java.awt.*;

public class Checkboxgrp {
    public static void main(String[] args) {
        Frame f=new Frame("Chechbox");
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox c=new Checkbox("Male",cg,true);
        Checkbox c1=new Checkbox("Female",cg,false);
        Checkbox c2=new Checkbox("Other",cg,false);

        c.setBounds(50,150,120,20);
        c1.setBounds(50,200,120,20);
        c2.setBounds(50,250,120,20);
        f.add(c);
        f.add(c1);
        f.add(c2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
