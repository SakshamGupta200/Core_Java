package DateTime;

import java.time.Period;

public class Period1 {
    public static void main(String[] args) {
        Period P=Period.of(2000,9,27);
        System.out.println(P);
        System.out.println(P.plus(Period.ofYears(4)));
    }
}
