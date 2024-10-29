import java.util.*;

public class Q9_FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char snake[][] = new char[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(snake[i], '.');
        }

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                Arrays.fill(snake[i], '#');
            } else {
                if (i / 2 % 2 == 0) {
                    // Place '#' at the far right
                    snake[i][m - 1] = '#';
                } else {
                    // Place '#' at the far left
                    snake[i][0] = '#';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(snake[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
