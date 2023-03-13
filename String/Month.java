package String;
import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month name");
        s= sc.nextLine();
        if (s.equals("January")){
            System.out.println("31 days");
        }
        else if (s.equals("Febuary")){
            System.out.println("28 days");
        }
        else if (s.equals("March")){
            System.out.println("31 days");
        }
        else if (s.equals("April")){
            System.out.println("30 days");
        }
        else if (s.equals("May")){
            System.out.println("31 days");
        }
        else if (s.equals("June")){
            System.out.println("30 days");
        }
        else if (s.equals("July")){
            System.out.println("31 days");
        }
        else if (s.equals("August")){
            System.out.println("31 days");
        }
        else if (s.equals("September")){
            System.out.println("30 days");
        }
        else if (s.equals("October")){
            System.out.println("31 days");
        }
        else if (s.equals("November")){
            System.out.println("30 days");
        }
        else if (s.equals("December")){
            System.out.println("31 days");
        }

    }
}
