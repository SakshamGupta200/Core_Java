import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.*;
public class Dic
{
JFrame f;
Dic()
{
f=new JFrame("My Frame");
DefaultListModel<String> l1=new DefaultListModel<String>();
HashMap<String,String> HM=new HashMap<String,String>();
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
for(Map.Entry m:HM.entrySet())
{
l1.addElement(String.valueOf(m.getKey()));
}
JList<String> list=new JList<>(l1);
list.setBounds(30,30,300,200);
JButton b=new JButton("Search");
b.setBounds(100,350,100,30);
JLabel l=new JLabel("--------------");
l.setBounds(100,400,150,30);
JTextField t=new JTextField();
t.setBounds(20,350,100,30);
f.add(list);
f.add(b);
f.add(l);
f.add(t);
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{

l.setText(HM.get(t.getText()));
}
});
list.addListSelectionListener(new ListSelectionListener()
{
public void valueChanged(ListSelectionEvent e)
{
if(list.getSelectedIndex()!=-1)
{
l.setText(HM.get(list.getSelectedValue()));
}
}
});
}
public static void main(String[] args)
{
new Dic();
}
}