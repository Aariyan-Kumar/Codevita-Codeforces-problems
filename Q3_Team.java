import java.util.*;
public class Q3_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++)
        {
            int Petya = sc.nextInt();
            int Vasya = sc.nextInt();
            int Tonya = sc.nextInt();

            if((Petya == 1 && Vasya == 1) || (Tonya == 1 && Vasya == 1) || (Petya == 1 && Tonya == 1))
            {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }    
}