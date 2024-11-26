import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Q40_ConsecutivePrimeSum {

    private static int limit = 100000 + 1;
    private static ArrayList<Boolean> isPrime = new ArrayList<>(Collections.nCopies(limit, true));
    private static ArrayList<Integer> primes = new ArrayList<>();
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        isPrime.set(0,false);
        isPrime.set(1,false);

        for(int i = 2; i * i <= limit; i++)
        {
            if(isPrime.get(i)) {
                primes.add(i);
                for(int j = i * i; j < limit; j = j + i) {
                    isPrime.set(j, false);
                }
            }
        }


        int T = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < T; i++)
        {
            int n = Integer.parseInt(sc.nextLine());
            int sum = 5;
            int j = 2;
            int count = 0;
            while (sum <= n && j < primes.size()) {
                if(isPrime.get(sum))
                {
                    count++;
                }

                sum = sum + primes.get(j);
                j++;
            }

            System.out.println(count);
        }

        sc.close();
    }

}