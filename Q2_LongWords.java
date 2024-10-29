import java.util.*;
public class Q2_LongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            String word = sc.next();
            int wordLength = word.length();
            if(wordLength > 10)
            {
                word = word.charAt(0) + String.valueOf(wordLength - 2) + word.charAt(wordLength - 1);
            }

            System.out.println(word);
        }

        sc.close();
    }
}
