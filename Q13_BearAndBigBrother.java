import java.util.Scanner;

public class Q13_BearAndBigBrother 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Likma = sc.nextInt();
        int bob = sc.nextInt();

        int count = 0;

        while (Likma <= bob) {
            Likma = Likma * 3;
            bob = bob * 2;

            count++;
        }


        System.out.println(count);

        sc.close();
    }
    
}
