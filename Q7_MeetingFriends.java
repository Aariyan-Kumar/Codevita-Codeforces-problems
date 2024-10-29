import java.util.*;;

public class Q7_MeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        if (x1 <= 100 && x2 <= 100 && x3 <= 100) {

            int arr[] = { x1, x2, x3 };
            Arrays.sort(arr);
            int median = arr[1];

            int res = Math.abs(x1 - median) + Math.abs(x2 - median) + Math.abs(x3 - median);

            System.out.println(res);
        }

        sc.close();
    }
}
