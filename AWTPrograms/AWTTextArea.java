package AWTPrograms;

import java.awt.*;

public class AWTTextArea {
    public static void main(String[] args) {
        Frame F=new Frame("Textarea tute");
        TextArea TA=new TextArea(" Hii, Good Morning !");
        TA.setBounds(50,150,200,60);

        F.add(TA);
        F.setSize(600,600);
        F.setLayout(null);
        F.setVisible(true);
    }
}
