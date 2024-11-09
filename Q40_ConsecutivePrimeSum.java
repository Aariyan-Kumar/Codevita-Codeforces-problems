import java.util.Scanner;

public class Q40_ConsecutivePrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());
        int ans[] = new int[T];

        for(int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            int res = consecutivePrime(N);
            ans[i] = res;
        }

        for(int i : ans)
        {
            System.out.println(i);
        }
        sc.close();
    }
    
    private static int consecutivePrime(int n) 
    {
        int x = 0;
        int count = 0;
        for(int i = 4; i <= n; i++)
        {
            if(isPrime(i))
            {
                x = rangePrimeSum(i);
                if (x == i) 
                {
                    count++;                    
                }
            }
        }
        return count;
    }

    private static int rangePrimeSum(int n) 
    {
        int sum = 0;
        for(int i = 1; i < n; i++)
        {
            if(isPrime(i))
            {
                sum = sum + i;
                if(sum == n)
                {
                    return sum;
                }
            }
        }
        return sum;
    }

    private static boolean isPrime(int n) 
    {
        int factCount = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                factCount++;
            }
        }
        if(factCount == 2)
        {
            return true;
        }
        
        return false;
    }

}