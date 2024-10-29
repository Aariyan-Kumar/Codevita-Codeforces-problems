import java.util.Scanner;

public class Q18_cAPS_lOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String result = processCapsLock(word);
        System.out.println(result);
        sc.close();
    }

    public static String processCapsLock(String word) {
        if (word.length() == 0) {
            return word;
        }

        boolean allUppercase = word.equals(word.toUpperCase());

        boolean firstLowerRestUpper = Character.isLowerCase(word.charAt(0))
                && word.substring(1).equals(word.substring(1).toUpperCase());

        if (allUppercase || firstLowerRestUpper) {
            return toggleCase(word);
        } else {
            return word;
        }
    }

    public static String toggleCase(String word) {
        StringBuilder toggled = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else {
                toggled.append(Character.toUpperCase(c));
            }
        }
        return toggled.toString();
    }
}
