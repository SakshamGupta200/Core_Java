package AWTPrograms;

import java.awt.*;

public class AWTMenubar {
    public static void main(String[] args) {
        Frame f=new Frame("Menubar");
        MenuBar mb=new MenuBar();
        Menu m=new Menu("File");
        Menu sub=new Menu("Course");
        MenuItem c1=new MenuItem("Java");
        MenuItem c2=new MenuItem("Java");
        MenuItem c3=new MenuItem("Java");
        MenuItem c4=new MenuItem("Java");
        sub.add(c1);
        sub.add(c2);
        sub.add(c3);
        sub.add(c4);
        MenuItem m1=new MenuItem("new");
        MenuItem m2=new MenuItem("open");
        MenuItem m3=new MenuItem("save");
        MenuItem m4=new MenuItem("save as");
        MenuItem m5=new MenuItem("print");
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(sub);
        m.add(m4);
        m.add(m5);

        mb.add(m);
        f.setMenuBar(mb);
        f.setSize(200,200);
        f.setVisible(true);
        f.setLayout(null);
    }
}
