import java.util.*;

public class Q6_SoftDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k, l, c, d, p, nl, np;

        n = sc.nextInt();
        k = sc.nextInt();
        l = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        p = sc.nextInt();
        nl = sc.nextInt();
        np = sc.nextInt();

        int totalDrinks = k * l;
        int totalLimes = c * d;

        int x = totalDrinks / (n * nl);
        int y = totalLimes / n;
        int z = p / (n * np);

        System.out.println(Math.min(Math.min(x, y), z));

        sc.close();
    }
}
