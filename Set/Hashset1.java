package Set;
import java.util.*;
public class Hashset1 {
    public static void main(String[] args) {
     HashSet<String> ht=new HashSet<>();
     int n;
     String name;
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Set");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter Fruits Name");
            name=sc.next();
            ht.add(name);
        }
        System.out.println("List Of Fruits");
        System.out.println(ht);
        Iterator<String> itr=ht.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
