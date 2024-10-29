import java.util.Arrays;
import java.util.Scanner;

public class Q17_HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String newS = "";

        for (char ch : s.toCharArray()) {
            if (ch != '+') {
                newS = newS + ch;
            }
        }

        char arr[] = newS.toCharArray();
        Arrays.sort(arr);

        s = "";

        for (char ch : arr) {
            s = s + "+" + ch;
        }

        System.out.println(s.substring(1, s.length()));

        sc.close();
    }

}