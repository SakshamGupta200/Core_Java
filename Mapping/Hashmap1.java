package Mapping;

import java.util.*;

public class Hashmap1 {
    public static void main(String[] args) {
        Map mp=new HashMap();
        mp.put(111,"taaja");
        mp.put(112,"Raaja");
        mp.put(113,"samiksha");
        mp.put(114,"saamy");
        mp.put(115,"sakshi");
        System.out.println(mp);
Set s=mp.entrySet();
Iterator itr=s.iterator();
while (itr.hasNext())
{
    Map.Entry entry=(Map.Entry)itr.next();
    System.out.println("Id="+entry.getKey()+",value="+entry.getValue());

}
    }
}
