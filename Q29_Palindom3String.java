import java.util.Scanner;

public class Q29_Palindom3String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String subString1 = "";
        String subString2 = "";
        String subString3 = "";

        if (word.length() < 3) {
            System.out.println("Impossible");
        }
        if (word.length() == 3) {
            char s1 = word.charAt(0);
            char s2 = word.charAt(1);
            char s3 = word.charAt(2);

            System.out.println(s1 + "\n" + s2 + "\n" + s3);
        }

        for (int i = 1; i < word.length(); i++) {
            subString1 = word.substring(0, i);
            if (isPalindrome(subString1)) {
                for (int j = 1; j < word.length() - i; j++) {
                    subString2 = word.substring(i, i + j);
                    subString3 = word.substring(i + j);
                    if (isPalindrome(subString2) && isPalindrome(subString3)) {
                        System.out.println(subString1 + "\n" + subString2 + "\n" + subString3);

                    }
                }
            }
        }

        sc.close();
    }

    public static boolean isPalindrome(String word) {
        boolean isPalindrome = true;
        int i = 0, j = word.length() - 1;
        while (i <= j) {
            char ch1 = word.charAt(i);
            char ch2 = word.charAt(j);
            if (ch1 != ch2) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }
}