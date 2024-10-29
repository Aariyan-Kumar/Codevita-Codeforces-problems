import java.util.*;

public class Q32_PrimeConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> naturalNumbers = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            naturalNumbers.add(x);
        }

        System.out.println(primeConstruction(naturalNumbers));

        sc.close();
    }

    private static String primeConstruction(ArrayList<Integer> naturalNumbers) 
    {
        String p = "";
        int q = Collections.min(naturalNumbers);
        int indexOfQ = naturalNumbers.indexOf(q);

        if(indexOfQ != -1)
        {
            naturalNumbers.remove(indexOfQ);
        }

        int res = findLcm(naturalNumbers);
        res = res + q; 

        if(isPrime(res))
        {
            p = String.valueOf(res);
        }
        else
        {
            p = "None";
        }

        return p;
    }

    private static boolean isPrime(int res) 
    {
        int factor = 0;

        for(int i = 1; i <= res; i++)
        {
            if(res % i == 0)
            {
                factor++;
            }
        }
        if(factor == 2)
        {
            return true;
        }
        return false;
    }

    private static int findLcm(ArrayList<Integer> naturalNumbers) 
    {
        int lcm = naturalNumbers.get(0);
        for(int i = 1; i < naturalNumbers.size(); i++)
        {
            lcm = ((lcm * naturalNumbers.get(i)) / (gcd(lcm, naturalNumbers.get(i))));
        }

        return lcm;
        
    }

    private static int gcd(int lcm, Integer integer) 
    {
        int gcd = 0;
        if(integer == 0)
        {
            gcd = lcm;
        }
        if(lcm == 0)
        {
            gcd = integer;
        }

        for(int i = 1; i < Math.min(lcm, integer); i++)
        {
            if(integer % i == 0 && lcm % i == 0)
            {
                gcd = i;
            }
        }

        return gcd;
    }
}
