package Conversion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class con_date 
{
   public static void main(String[] args) throws ParseException
   {
    String s="27/06/2022";
    
    Date d =  new SimpleDateFormat("mm/dd/yyyy").parse(s);
    System.out.println(d);
    
   } 
}
