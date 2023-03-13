package Collcetion.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
            String [] name={"Saksham","Sam","Rohit","Deep","Kaushal"};
        System.out.println("List of name ="+ Arrays.toString(name));
        List<String> li=new ArrayList<String>();
        for (String S:name) {
            li.add(S);

        }
        System.out.print(li);
    }
}
