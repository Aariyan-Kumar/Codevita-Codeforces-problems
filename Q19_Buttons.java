import java.util.*;
public class Q19_Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = n;

        for(int i = 1; i < n; i++ )
        {
            sum = sum + (n - i) * i;
        }

        System.out.println(sum);
        sc.close();

    }    
}