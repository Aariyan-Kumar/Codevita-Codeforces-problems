import java.util.Scanner;

public class Q14_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int count = 0;

        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count++;
            }
        }

        if(count > (word.length() / 2))
        {
            word = word.toUpperCase();
        }
        else
        {
            word = word.toLowerCase();
        }

        System.out.println(word);

        sc.close();
    }
}

