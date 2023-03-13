package DateTime;

import java.time.LocalDate;
import java.util.Date;

public class Localdate1 {
    public static void main(String[] args) {
        LocalDate LD=LocalDate.now();
        System.out.println("Current Date : "+LD);
        LocalDate before= LD.minusDays(2);

        System.out.println("Before Date : "+before);
    }
}
