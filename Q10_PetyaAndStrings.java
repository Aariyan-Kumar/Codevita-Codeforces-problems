import java.util.*;

public class Q10_PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        int res = Lexicographical(word1, word2);

        System.out.println(res);

        sc.close();
    }

    public static int Lexicographical(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        int x = 0;

        for (int i = 0; i < word1.length(); i++) {

            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            if (ch1 > ch2) {
                x = 1;
                break;
            } else if (ch1 < ch2) {
                x = -1;
                break;
            }
        }

        return x;
    }
}
