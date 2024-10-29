import java.util.Scanner;

public class Q37_OnACube {

    final static double PI = 3.14d;
    static double sx, sy, sz;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        String pos[] = input.split(",");
        sx = Double.valueOf(pos[0]);
        sy = Double.valueOf(pos[1]);
        sz = Double.valueOf(pos[2]);

        double sum = 0.0d;
        for (int i = 3; i < N * 3; i = i + 3) {
            sum = sum + solveDist(Double.valueOf(pos[i]), Double.valueOf(pos[i + 1]), Double.valueOf(pos[i + 2]));
        }

        System.out.printf("%.2f", sum);

        sc.close();
    }

    private static double solveDist(double x, double y, double z) {

        double dis;

        // Case where the beetle moves on the same face (same z-coordinate and x or y
        // changes)
        if (z == sz && (y != sy || x != sx) && sz != 0) {
            if (x != sx) {
                dis = (2 * PI * (Math.abs(x - sx))) / 6.0f;
            } else {
                dis = (2 * PI * (Math.abs(y - sy))) / 6.0f;
            }
        }

        // Case where the beetle moves on the same face (same x-coordinate and z or y
        // changes)
        else if (x == sx && (z != sz || y != sy) && sx == 0) {
            if (z != sz) {
                dis = (2 * PI * (Math.abs(z - sz))) / 6.0f;
            } else {
                dis = (2 * PI * (Math.abs(y - sy))) / 6.0f;
            }

        }

        // Case where the beetle moves on the same face (same y-coordinate and z or x
        // changes)
        else if (y == sy && (z != sz || x != sx) && sy == 0) {
            if (z != sz) {
                dis = (2 * PI * (Math.abs(z - sz))) / 6.0f;
            } else {
                dis = (2 * PI * (Math.abs(x - sx))) / 6.0f;
            }

        }

        // Case where the beetle moves between different faces (shortest path).
        // Euclidean distance formula
        else {
            dis = (int) (Math.sqrt(Math.pow(x - sx, 2) + Math.pow(y - sy, 2)) + Math.abs(z - sz));
        }

        // Update the beetle's position
        sx = x;
        sy = y;
        sz = z;

        return dis;
    }
}
