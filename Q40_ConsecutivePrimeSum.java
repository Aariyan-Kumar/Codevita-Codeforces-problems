/*
* Consecutive Prime Sum Some prime numbers can be expressed as a sum of other consecutive prime numbers.
    For Example:
    5=2+3,
    17=2+3+5+7,
    41=2+3+5+7+11+13.
* Your task is to find out how many prime numbers which satisfy this property are present in the range 3 to N subject to a constraint that summation should always start with number 2.

* Write code to find out the number of prime numbers that satisfy the above-mentioned property in a given range.

    Input Format:
    The first line of input will contain a single integer 
    T, denoting the number of test cases.Each test case consists of a single integer N
    Output Format:
    Print the total number of all such prime numbers which are less than or equal to N.

    Constraints
    1 ≤ T ≤ 10^5
    2 < N ≤ 10^5
 
    Sample 1:
    Input
    2
    20
    15
    Output
    2
    1
    Explanation:
    Test Case 1: Below 20 are two such cases 5 and 17
    5 = 2 + 3
    17 = 2 + 3 + 5 + 7 
*/


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