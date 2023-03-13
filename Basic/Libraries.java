package Basic;

import java.util.ArrayList;

public class Libraries{
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        System.out.println("Removed value: "+ myArrayList.remove(2));
        myArrayList.clear();
        System.out.println("size of my array list: " + myArrayList.size());
        System.out.println("size of my array List: " +myArrayList.size());
        System.out.println("Now printing values: ");
        System.out.println(myArrayList.size());
        for(Integer value: myArrayList) {
            System.out.println(value);
        }
        System.out.println(myArrayList.contains(4));
    }
}
