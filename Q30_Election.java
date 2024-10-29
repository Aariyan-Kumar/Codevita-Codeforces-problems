import java.util.Scanner;

public class Q30_Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char voters[] = new char[n];
        for (int i = 0; i < n; i++) {
            voters[i] = sc.next().charAt(0);
        }

        System.out.println(winner(voters));

        sc.close();
    }

    private static String winner(char[] voters) {
        String winner = "";

        int dashCount = 0;
        int countA = 0;
        int countB = 0;
        int temp = 0;

        boolean foundA = false;
        boolean foundB = false;

        for (int i = 0; i < voters.length; i++) {
            if (voters[i] == '-') {
                dashCount++;
            } else if (voters[i] == 'A') {
                countA++;
                foundA = true;
                if (foundB == false) {
                    countA = countA + dashCount;
                    dashCount = 0;
                    foundA = false;
                } else {
                    temp = temp + dashCount;
                    temp = (int) temp / 2;
                    countA = countA + temp;
                    countB = countB + temp;
                    temp = 0;
                    dashCount = 0;
                    foundA = false;
                    foundB = false;
                    dashCount = 0;
                }
            } else if (voters[i] == 'B') {
                countB++;
                foundB = true;
                if (foundA == true) {
                    temp = temp + dashCount;
                    temp = (int) temp / 2;
                    countA = countA + temp;
                    countB = countB + temp;
                    temp = 0;
                    dashCount = 0;
                    foundA = false;
                    foundB = false;
                    dashCount = 0;
                }
            }
        }
        if (foundB == true && dashCount != 0) {
            countB = countB + dashCount;
        }

        if (countA > countB) {
            winner = "A";
        } else if (countB > countA) {
            winner = "B";
        } else {
            winner = "Coalition government";
        }

        return winner;
    }
}
