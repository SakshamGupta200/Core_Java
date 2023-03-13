package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime1 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        String str= ldt.format(dtf);
        System.out.println("After Formate : "+str);

    }
}
