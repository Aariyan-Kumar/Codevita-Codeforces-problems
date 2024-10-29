import java.util.*;

public class Q28_LexciographicWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        String res[] = new String[t];
        for (int i = 0; i < t; i++) {
            String p = sc.nextLine();
            String s = sc.nextLine();

            res[i] = WordHelp(p, s);

        }

        for (String s : res) {
            System.out.println(s);
        }

        sc.close();
    }

    public static String WordHelp(String p, String s) {
        String ans = "";
        int arr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[i] = p.indexOf(ch);
        }
        Arrays.sort(arr);

        for (int i = 0; i < s.length(); i++) {
            ans = ans + p.charAt(arr[i]);
        }

        return ans;
    }
}
