package DateTime;



import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Emptime {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
        Date DayBefore  =sdf.parse("09/10/2022");
        Date DayAfter   =sdf.parse("09/10/2023");
    long timedef=Math.abs(DayAfter.getTime()-DayBefore.getTime());
    long daydef=TimeUnit.DAYS.convert(timedef,TimeUnit.MILLISECONDS);
        System.out.println("Day Difference : "+daydef);

    }
}
