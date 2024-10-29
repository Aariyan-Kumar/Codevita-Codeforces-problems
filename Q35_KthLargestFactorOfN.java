import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q35_KthLargestFactorOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String strArr[] = input.split(",");

        int a = Integer.valueOf(strArr[0]);
        int b = Integer.valueOf(strArr[1]);
        
        ArrayList<Integer> factors = new ArrayList<>();
        
        for(int i = 1; i <= a; i++)
        {
            if(a % i == 0)
            {
                factors.add(i);
            }
        }

        Collections.sort(factors, Collections.reverseOrder());
        if((b - 1) >= 0 && (b - 1) < factors.size())
        {
            System.out.println(factors.get(b - 1));
        }
        else
        {
            System.out.println("1");
        }

        sc.close();
    }
}
