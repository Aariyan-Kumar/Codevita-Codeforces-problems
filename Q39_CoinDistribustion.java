import java.util.Scanner;

public class Q39_CoinDistribustion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        int one = 0;
        int two = 0;
        int five = (N - 4) / 5;

        if ((N - 5 * five ) % 2 == 0)
        {
            one = 2;
        }
        else
        {
            one = 1;
        }
        
        two = (N - 5 * five - one) / 2;

        System.out.print(one + two + five + " ");
        System.out.print(five + " "+ two + " " + one);

        sc.close();
    }
    
}