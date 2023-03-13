package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Find_DOB {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        LocalDate ld=LocalDate.of(2000 , 9 , 27);
        int m1=ldt.getMonthValue();
        int y1=ldt.getYear();
        int d1=ldt.getDayOfMonth();

        int m2=ld.getMonthValue();
        int y2=ld.getYear();
        int d2 =ld.getDayOfMonth();
        int m,d,y;
        if (d1>d2)
        {
            d=d1-d2;
        }
        else
        {
            d1=d1+30;
            m1=m1-1;
            d=d1-d2;
        }
        if(m1>m2)
        {
            m=m1-m2;
        }
        else
        {
            m1=m1+12;
            y1=y1-1;
            m=m1-m2;
        }
        y=y1-y2;

        System.out.println(y+" Year "+m+" Month "+d+" Day");
    }
}
