import java.util.Scanner;

public class Q25_Game23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(check(n, m));
        sc.close();
    }

    private static int check(int n, int m) {
        int res = -1;
        if(m == n)
        {
            return 0;
        }
        int d = 0;
        if(m % n == 0)
        {
            res = 0;
            d = m / n;
            while(d % 2 == 0)
            {
                d = d /2;
                res ++;
            }
            while (d % 3 == 0) {
                d = d / 3;
                res++;
            }
            if(d != 1)
            {
                return -1;
            }
        }
        return res;
    }
}