package DateTime;

import java.time.DayOfWeek;

public class DayOfWeek1 {
    public static void main(String[] args) {
        DayOfWeek dow=DayOfWeek.of(5);
        System.out.println(dow.name());
        System.out.println(dow.ordinal());
        System.out.println(dow.getValue());
    }
}
