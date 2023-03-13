package Collcetion.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Listget {
    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("Rkb");
        li.add("cgsd");
        li.add("xnjds");
        li.add("xbx");
        li.add("sdjis");
        li.add("cjd");
        li.add("sdis");
        li.add("cdsf");
        System.out.println(li);
        System.out.println(li.get(5));
        System.out.println(li.set(4,"Saksham"));
        System.out.println(li);
    }
}
