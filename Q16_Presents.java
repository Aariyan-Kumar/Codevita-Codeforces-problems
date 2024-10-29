import java.util.Scanner;

public class Q16_Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int input[] = new int[n];
        int temp;

        for (int i = 1; i <= input.length; i++) {
            temp = sc.nextInt();
            input[temp - 1] = i;
        }

        for(int i = 0; i < input.length; i++)
        {
            System.out.print(input[i] + " ");
        }

        sc.close();
    }
}
