import java.util.*;

public class Q11_Capatilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        char ch = Character.toUpperCase(word.charAt(0));

        word = ch + word.substring(1);

        System.out.println(word);

        sc.close();
    }
}
