package Collcetion.Arraylist;

import java.util.*;

public class Removelist {
    public static void main(String[] args) {
        String S;
        List<String> li=new ArrayList<String>();
        List<Integer> li1=new ArrayList<Integer>();
        li1.add(121);
        li1.add(125);
        li1.add(120);
        li1.add(123);
        li1.add(1288);
        li1.add(1215);
        System.out.println(li1);
        Collections.sort(li1);
        System.out.println(li1);
        ListIterator itr=li1.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        System.out.println("--------");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }



       li.add("Rkb");
        li.add("cgsd");
        li.add("xnjds");
        li.add("xbx");
        li.add("sdjis");
        li.add("cjd");
        li.add("sdis");
        li.add("cdsf");
        System.out.println(li);
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name :");
        S= sc.nextLine();
        li.remove(S);
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);
    }
}
