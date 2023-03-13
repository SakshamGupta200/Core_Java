package DateTime;

import java.time.LocalTime;

public class LocalTime1 {
    public static void main(String[] args) {
        LocalTime lt= LocalTime.now();
        System.out.println(lt);
        LocalTime lt1= lt.minusHours(3);
        LocalTime lt2= lt1.minusMinutes(30);
        System.out.println(lt1);
        System.out.println(lt2);
        LocalTime lt3=lt.plusHours(4);
        LocalTime lt4=lt3.plusMinutes(35);
        System.out.println(lt3);
        System.out.println(lt4);
    }
}
