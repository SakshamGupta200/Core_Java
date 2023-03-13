package Collcetion.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class List3 {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<String>();
        ar.add("Saksham");
        ar.add("Saksham");
        ar.add("Saksham");
        ar.add("Saksham");
        ar.add("Saksham");
        ar.add("Saksham");
        ar.add("Saksham");
        ar.add("Saksham");
        System.out.println(ar);
        String [] name=ar.toArray(new String[ar.size()]);
        System.out.println(Arrays.toString(name));

        }
    }

