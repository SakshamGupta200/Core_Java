package DateTime;

import java.time.Year;

public class Year1 {
    public static void main(String[] args) {
        Year Y=Year.now();
        System.out.println("Current Year "+Y);
        System.out.println("Length = "+Y.length());
        System.out.println("Leap Yerar ="+Y.isLeap());
    }
}
