import java.util.Scanner;

public class Q21_Showering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int m = sc.nextInt();

            if (n == 0) {
                if (m >= s) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue; // Move to the next test case
            }

            int arr[][] = new int[n][2];

            for (int j = 0; j < n; j++) {
                arr[j][0] = sc.nextInt();
                arr[j][1] = sc.nextInt();
            }

            boolean canShower = false;

            if (arr[0][0] >= s) {
                canShower = true;
            }

            for (int j = 1; j < n; j++) {
                if (arr[j][0] - arr[j - 1][1] >= s) {
                    canShower = true;
                }
            }

            if (m - arr[n - 1][1] >= s) {
                canShower = true;
            }

            if (canShower) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }

}