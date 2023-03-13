package Set;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset2 {
    public static void main(String[] args) {
        HashSet<String> city1=new HashSet<String>();
        HashSet<String> city2=new HashSet<String>();
        city1.add("Varanasi");
        city1.add("Bhadohi");
        city1.add("Bihar");
        city1.add("NaviMumbai");
        city1.add("Durgakund");
        System.out.println(city1);
        city2.add("Varodara");
        city2.add("Goa");
        city2.add("NaviMumbai");
        city2.add("Hydrabad");
        city2.add("Durgakund");
        System.out.println(city2);
        city1.addAll(city2);
        System.out.println(city1);
        city1.removeAll(city2);
        System.out.println(city1);
        city1.clear();
        System.out.println(city1);
        ArrayList<String> city3= new ArrayList<String>();

        city3.add("Delhi");
        city3.add("Abu Dhabhi");
        city3.add("Mumbai");
        city3.add("Odisa");
        city3.add("Karnatka");
        System.out.println(city3);
        HashSet<String> city4=new HashSet(city3);
        System.out.println(city4);
    }
}
