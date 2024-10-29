import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q38_MinimizeTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int array[] = new int[N];

        for(int i = 0; i < N; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println(minimiseTheSum(array, N, K));

        sc.close();
    }

    private static int minimiseTheSum(int[] array, int N, int K) {
        PriorityQueue<Integer> arr = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            arr.add(array[i]);
        }

        while (!arr.isEmpty() && K > 0) {
            int x = (int) Math.floor(arr.poll() / 2);
            arr.add(x);
            K--;

        }
        int sum = 0;

        while (!arr.isEmpty()) {
            sum = sum + arr.poll();
        }

        return sum;
    }
}
