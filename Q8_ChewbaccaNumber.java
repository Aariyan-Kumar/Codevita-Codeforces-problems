import java.util.*;

public class Q8_ChewbaccaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next(); // Read the number as a string for easier manipulation
        StringBuilder result = new StringBuilder();

        // Process the first digit separately to avoid leading zero
        char firstDigit = x.charAt(0);
        if (firstDigit >= '5' && firstDigit != '9') {
            result.append((char) ('9' - firstDigit + '0')); // Invert if greater than 5, but don't invert '9' to '0'
        } else {
            result.append(firstDigit); // Leave it unchanged if less than 5 or if it's 9
        }

        // Process the rest of the digits
        for (int i = 1; i < x.length(); i++) {
            char currentDigit = x.charAt(i);
            if (currentDigit >= '5') {
                result.append((char) ('9' - currentDigit + '0')); // Invert if greater than or equal to 5
            } else {
                result.append(currentDigit); // Leave it unchanged if less than 5
            }
        }

        System.out.println(result.toString());
        sc.close();
    }
}
