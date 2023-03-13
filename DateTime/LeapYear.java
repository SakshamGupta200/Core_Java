package DateTime;

import java.time.LocalDate;

public class LeapYear {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.of(2016,03,19);
        System.out.println("Leap Year = "+ld.isLeapYear());
    }
}
