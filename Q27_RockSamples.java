import java.util.Arrays;
import java.util.Scanner;

public class Q27_RockSamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt(); // No. of sample input.
        int r = sc.nextInt(); // No. of range input.

        int rocks[] = new int[s]; // Array for the rocks quality input.

        for (int i = 0; i < s; i++) {
            rocks[i] = sc.nextInt(); // Accepting the Values of rocks
        }

        int range[][] = new int[r][2]; // 2D Array for the input of the range.

        for (int i = 0; i < r; i++) {
            range[i][0] = sc.nextInt();
            range[i][1] = sc.nextInt();
        }

        Arrays.sort(rocks);

        int res[] = new int[r]; // Array for storing result

        for (int i = 0; i < r; i++) {
            int min = range[i][0];
            int max = range[i][1];

            int startIndex = lowerBound(rocks, min);
            int endIndex = upperBound(rocks, max);

            res[i] = endIndex - startIndex;
        }

        for (int count : res) {
            System.out.println(count); // printing the output
        }

        sc.close();
    }

    private static int upperBound(int[] rocks, int min) {
        int left = 0, right = rocks.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(rocks[mid] <= min)
            {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }

    private static int lowerBound(int[] rocks, int max) {
        int left = 0, right = rocks.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (rocks[mid] < max) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}
