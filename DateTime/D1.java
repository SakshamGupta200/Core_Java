package DateTime;

import java.io.File;
import java.util.Date;

public class D1 {
    public static void main(String[] args) {
        File f=new File("SK88.txt");
        Date dt=new Date(f.lastModified());
        System.out.println(dt);
    }
}
