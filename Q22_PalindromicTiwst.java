import java.util.Scanner;

public class Q22_PalindromicTiwst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res[] = new String[n];
        
        for(int i = 0; i < n; i++)
        {
            int len = sc.nextInt();
            String str = sc.next();

            res[i] = StringChange(str, len);
        }

        for(String s : res)
        {
            System.out.println(s);
        }

        sc.close();
    }

    private static String StringChange(String str, int len) 
    {
        char letters[] = str.toCharArray();
        
        for (int i = 0; i < len / 2; i++) {
            int left = letters[i];
            int right = letters[len - 1 - i];

            if (Math.abs(left - right) != 0 && Math.abs(left - right) != 2) {
                return "NO";
            }
        }

        return "YES";
        
    }

}