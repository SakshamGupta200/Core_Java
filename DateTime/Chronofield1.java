package DateTime;

import java.net.SocketTimeoutException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.*;


public class Chronofield1 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.get(ChronoField.DAY_OF_WEEK));
        System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ldt.get(ChronoField.DAY_OF_YEAR));
    }
}
