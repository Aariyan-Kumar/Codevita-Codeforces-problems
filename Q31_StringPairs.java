import java.util.Scanner;

public class Q31_StringPairs {

    private static final String[] words = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six",
            "twenty-seven", "twenty-eight", "twenty-nine",
            "thirty", "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five", "thirty-six",
            "thirty-seven", "thirty-eight", "thirty-nine",
            "forty", "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven",
            "forty-eight", "forty-nine",
            "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four", "fifty-five", "fifty-six", "fifty-seven",
            "fifty-eight", "fifty-nine",
            "sixty", "sixty-one", "sixty-two", "sixty-three", "sixty-four", "sixty-five", "sixty-six", "sixty-seven",
            "sixty-eight", "sixty-nine",
            "seventy", "seventy-one", "seventy-two", "seventy-three", "seventy-four", "seventy-five", "seventy-six",
            "seventy-seven", "seventy-eight", "seventy-nine",
            "eighty", "eighty-one", "eighty-two", "eighty-three", "eighty-four", "eighty-five", "eighty-six",
            "eighty-seven", "eighty-eight", "eighty-nine",
            "ninety", "ninety-one", "ninety-two", "ninety-three", "ninety-four", "ninety-five", "ninety-six",
            "ninety-seven", "ninety-eight", "ninety-nine",
            "one hundred"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = Integer.parseInt(sc.nextLine());
        
        
        for(int i = 0; i < k; i++)
        {
            int n = sc.nextInt();
            int number[] = new int[n];

            for(int j = 0; j < n; j++)
            {
                number[j] = sc.nextInt();
            }
            System.out.println(stringpair(number));
        }



        sc.close();
    }

    private static String stringpair(int number[]) {
        String textArray[] = new String[number.length];
        int digitD = 0;
        for(int i = 0; i < number.length; i++)
        {
            textArray[i] = words[number[i]];
            digitD = digitD + vowels(textArray[i]);
        }
        
        int sumCount = 0;

        for(int i = 0; i < number.length; i++)
        {
            for(int j = i + 1; j < number.length; j++)
            {
                int x = number[i] + number[j];
                if(x == digitD)
                {
                    sumCount++;
                }
            }
        }

        return words[sumCount];
    }

    private static int vowels(String str) {
        int countVowels = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                countVowels++;
            }
        }

        return countVowels;
    }   
}