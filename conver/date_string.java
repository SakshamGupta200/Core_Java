package conver;
import java.time.LocalDate;
import java.util.*;
public class date_string 
{
    public static void main(String[] args) 
    {
       LocalDate d=LocalDate.now(); 
       String s= String.valueOf(d);
       System.out.println(s);

    }
}
