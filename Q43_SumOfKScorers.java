import java.util.Arrays;
import java.util.Scanner;

public class Q43_SumOfKScorers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        int K = Integer.parseInt(sc.nextLine());

        int arr[] = new int[N];

        for(int i = 0 ; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr);
        int sum = 0;

        for(int i = K ; i < N; i++)
        {
            sum = sum + arr[i];
        }

        System.out.println(sum);

        sc.close();
    }
}
