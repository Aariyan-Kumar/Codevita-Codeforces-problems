import java.util.ArrayList;
import java.util.Scanner;

public class Q34_CollectingCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());
        
        for (int i = 1; i <= T; i++) {

            ArrayList<Integer> time = new ArrayList<>();

            int N = sc.nextInt();
            int candiBox[] = new int[N];
            for (int j = 0; j < N; j++) {
                candiBox[j] = sc.nextInt();
            }
            // input completed

            int finalTime = 0;
            int x = candiBox[0];

            for (int j = 1; j < N; j++) {
                x = x + candiBox[j];
                time.add(x);
            }

            // Sumission and storing completed

            for (int j = 0; j < time.size(); j++) {
                finalTime = finalTime + time.get(j);
            }

            System.out.println(finalTime);

        }

        sc.close();
    }
}
