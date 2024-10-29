import java.util.Scanner;

public class Q20_AB_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int sum = 0;
            for (int j = arr[i]; j != 0; j = j / 10) {
                int r = j % 10;
                sum = sum + r;
            }
            arr2[i] = sum;
        }
        for(int i : arr2)
        {
            System.out.println(i);
        }
        sc.close();
    }
}
