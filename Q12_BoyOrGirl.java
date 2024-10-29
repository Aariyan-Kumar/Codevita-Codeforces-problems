import java.util.*;

public class Q12_BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.next();

        Set<Character> ch = new HashSet<>();

        for (int i = 0; i < username.length(); i++) {
            ch.add(username.charAt(i));
        }

        if (ch.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
