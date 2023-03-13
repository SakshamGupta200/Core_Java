package DateTime;

import java.time.*;


public class YearMonth1 {
    public static void main(String[] args) {
        YearMonth ym=YearMonth.now();
        YearMonth ym1=YearMonth.of(2000,9);
                // int M= ym1.getMonthValue();
        System.out.println(ym);
        String Dayname=ym.atDay(27).getDayOfWeek().name();
        System.out.println(Dayname);
        String dn=ym1.atDay(27).getDayOfWeek().name();
        System.out.println(dn);

    }
}
