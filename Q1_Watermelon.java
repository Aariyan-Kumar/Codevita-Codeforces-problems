import java.util.*;

public class Q1_Watermelon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();

        if (W <= 100 && W >= 1) {
            if (W % 2 == 0 && W != 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}