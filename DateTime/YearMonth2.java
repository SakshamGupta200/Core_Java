package DateTime;

import java.time.Period;
import java.time.YearMonth;

public class YearMonth2 {
    public static void main(String[] args) {
        YearMonth ym=YearMonth.now();
        System.out.println("Current Year : "+ym );
        YearMonth ym1=ym.plus(Period.ofYears(2));
        YearMonth ym2=ym1.minus(Period.ofYears(4));
        System.out.println("After Adding = "+ym1);
        System.out.println("After Substracting = "+ym2);
    }
}
