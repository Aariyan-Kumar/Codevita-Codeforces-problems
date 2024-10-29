import java.util.Scanner;

public class Q15_InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int opinion[] = new int[n];
        boolean flag = false;

        for(int i = 0; i < n; i++)
        {
            opinion[i] = sc.nextInt();
            if(opinion[i] == 1)
            {
                flag = true;
            }
        }

        if(flag == true)
        {
            System.out.println("HARD");
        }
        else
        {
            System.out.println("EASY");
        }

        sc.close();
    }
}
