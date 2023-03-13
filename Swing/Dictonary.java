package Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Dictonary extends JDialog {
    private JPanel contentPane;
    private JButton button1;
    private JTextField textField1;
    private JList list1;
    private JLabel label2;
    private JLabel label1;
    private JButton buttonOK;

    public Dictonary() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        HashMap<String , String> HM = new HashMap<>();
        DefaultListModel <String> dfl = new DefaultListModel<>();
        HM.put("Apple","सेब");
        HM.put("Banana","केला");
        HM.put("Cat","बिल्ली");
        HM.put("Dog","कुत्ता");
        HM.put("Egg","अंडा");
        HM.put("Fan","पंखा");
        HM.put("Girl","लड़की");
        HM.put("Hen","मुर्गी");
        HM.put("Ink","स्याही");
        HM.put("Joker","जोकर");
        HM.put("Kite","पतंग");
        HM.put("Lion","शेर");
        HM.put("Monkey","बंदर");
        HM.put("Nest","घोसला");
        HM.put("Orange","संतरा");
        HM.put("Parrot","तोता");
        HM.put("Queen","रानी");
        HM.put("Rat","चूहा");
        HM.put("Sun","सूरज");
        HM.put("Tiger","बाघ");
        HM.put("Umbrella","छाता");
        HM.put("Van","वैन");
        HM.put("Watch","घडी,देखना");
        HM.put("X-mus","एक्स-मस");
        HM.put("Yolk","अंडे की जर्दी");
        HM.put("Zoo","चिड़ियाघर");

        for (Map.Entry m:HM.entrySet()){
            dfl.addElement(String.valueOf(m.getKey()));
        }
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                label2.setText(HM.get(textField1.getText()));
            }
        });
        list1.addListSelectionListener(new ListSelectionListener()
        {
            public void valueChanged(ListSelectionEvent e)
            {
                if(list1.getSelectedIndex()!=-1)
                {
                    label2.setText(HM.get(list1.getSelectedValue()));
                }
            }
        });
    }

    public static void main(String[] args) {
        Dictonary dialog = new Dictonary();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
