import java.util.*;

public class Q36_CountPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        if (k != 0) {
            System.out.println(solveCountPairs(A, k));
        } else {
            System.out.println(0);
        }

        sc.close();
    }

    private static int solveCountPairs(int[] a, int k) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            int min = a[i] - k;
            int max = a[i] + k;

            for (int j = 0; j < a.length; j++) {
                if (a[j] >= min && a[j] <= max && j != i) {
                    count++;
                    break;
                }
            }

        }

        return count;
    }
}
