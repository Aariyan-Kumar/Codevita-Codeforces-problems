/*
 * 
 * Counting Rock Samples
 * Juan Marquinho is a geologist and he needs to count rock samples in order to send it to a chemical laboratory. He has a problem: The laboratory only accepts rock samples by a range of its size in ppm (parts per million).
 * Juan Marquinho receives the rock samples one by one and he classifies the rock samples according to the range of the laboratory. This process is very hard because the number of rock samples may be in millions.
 * Juan Marquinho needs your help, your task is to develop a program to get the number of rocks in each of the ranges(Inclusive) accepted by the laboratory.
 * Input Format
    First line contains an positive integer S (the number of rock samples) separated by a blank space, and a positive integer R (the number of ranges of the laboratory)
    Second line contains a list of the sizes of S samples (in ppm), as positive integers separated by space
    Next R lines where the ith line containing two positive integers, space separated, indicating the minimum size and maximum size respectively of the ith range.
* Output Format
    R lines where the ith line contains a single non-negative integer indicating the number of the samples which lie in the ith range.
* Constraints
    10 ≤ S ≤ 10^4
    1 ≤ R ≤ 10^5
    1 ≤ S ≤ 10^3
 
* Sample 1:
    Input:
    10 2
    300 604 350 433 704 470 808 718 517 811
    300 350
    400 700
    Output:
    2 4
    Explanation:
    The ranges are 300-350 and 400-700. There are 2 samples in the first range (300 and 350) and 4 samples in the second range (604, 433, 470, 517). Hence the two lines of the output are 2 and 4

* Sample 2:
    Input:
    20 3
    921 107 270 631 926 543 589 520 595 93 873 424 759 537 458 614 725 842 575 195
    1 100
    50 600
    1 1000
    Output:
    1 12 20
 */


import java.util.Arrays;
import java.util.Scanner;

public class Q27_RockSamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt(); // No. of sample input.
        int r = sc.nextInt(); // No. of range input.

        int rocks[] = new int[s]; // Array for the rocks quality input.

        for (int i = 0; i < s; i++) {
            rocks[i] = sc.nextInt(); // Accepting the Values of rocks
        }

        int range[][] = new int[r][2]; // 2D Array for the input of the range.

        for (int i = 0; i < r; i++) {
            range[i][0] = sc.nextInt();
            range[i][1] = sc.nextInt();
        }

        Arrays.sort(rocks);

        int res[] = new int[r]; // Array for storing result

        for (int i = 0; i < r; i++) {
            int min = range[i][0];
            int max = range[i][1];

            int startIndex = lowerBound(rocks, min);
            int endIndex = upperBound(rocks, max);

            res[i] = endIndex - startIndex;
        }

        for (int count : res) {
            System.out.println(count); // printing the output
        }

        sc.close();
    }

    private static int upperBound(int[] rocks, int min) {
        int left = 0, right = rocks.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(rocks[mid] <= min)
            {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }

    private static int lowerBound(int[] rocks, int max) {
        int left = 0, right = rocks.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (rocks[mid] < max) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}
