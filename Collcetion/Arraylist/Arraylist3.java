package Collcetion.Arraylist;

import java.util.ArrayList;

public class Arraylist3 {
    public static void main(String[] args) {

        ArrayList <Integer> ar=new ArrayList<>();
        ArrayList <Integer> ar1=new ArrayList<>();
        ar.add(258);
        ar.add(258);
        ar.add(258);
        ar.add(258);
        ar.add(258);
        ar.add(258);
        System.out.println(ar);
        ar1.add(255);
        ar1.add(255);
        ar1.add(255);
        ar1.add(255);
        ar1.add(255);
        ar1.add(255);
        System.out.println(ar1);
        ar.addAll(ar1);
        System.out.println(ar);
        ar.addAll(2,ar1);
        System.out.println(ar);

    ar.clear();
        System.out.println(ar);



    }
}
