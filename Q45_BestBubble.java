import java.util.Scanner;

public class Q45_BestBubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int res = beautyArray(array);

        System.out.println(res);

        sc.close();
    }

    private static int beautyArray(int[] array) {

        int arr1[] = array.clone();
        int arr2[] = array.clone();

        int ascendingSort = bubbleSort(arr1, true);
        int descendingSort = bubbleSort(arr2, false);
        return Math.min(ascendingSort, descendingSort);
    }

    private static int bubbleSort(int[] arr, boolean ascending) {

        int swap = 0;
        int temp = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1]))
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
        }

        return swap;
    }
}
