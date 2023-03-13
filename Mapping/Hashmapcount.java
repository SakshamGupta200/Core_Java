package Mapping;
import java.util.*;
public class Hashmapcount {
    public static void main(String[] args) {
        int digit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        // initialize map to hold digits and their count
        Map<Integer, Integer> digitMap = new HashMap<Integer, Integer>();
        int remainder = 0;
        // loop to get digits of the number
        while (number > 0) {
            // get the last digit
            remainder = number % 10;
            // get the frequency count of this digit
            Integer count = digitMap.get(remainder);
            // for the first time count will be null, hence put 1
            if (count == null) {
                digitMap.put(remainder, 1);
            } else {
                // increment the count for this digit
                digitMap.put(remainder, ++count);
            }
            // remove the last digit from the number
            number = number / 10;
        }
        System.out.println("-------------------------");
        System.out.println("Number\tFrequency");
        System.out.println("-------------------------");
        Iterator iterator = digitMap.keySet().iterator();
        while (iterator.hasNext()) {
            digit = (int) iterator.next();
            int digitCount = digitMap.get(digit);
            System.out.println(digit + "\t" + digitCount);
        }
    }
}
