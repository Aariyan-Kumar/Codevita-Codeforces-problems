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
            for (int j = 0; j < 2; j++) {
                range[i][j] = sc.nextInt(); // Accepting the values of the range.
            }
        }

        int res[] = new int[r]; // Array for storing result

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                if (rocks[j] >= range[i][0] && rocks[j] <= range[i][1]) {
                    res[i]++;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            System.out.print(res[i] + " "); // printing the output
        }

        sc.close();
    }
}
