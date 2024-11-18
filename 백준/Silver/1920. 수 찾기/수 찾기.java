import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {

            int findTarget = sc.nextInt();

            int startIdx = 0;
            int endIdx = arr.length - 1;

            boolean find = false;

            while (startIdx <= endIdx) {
                int midIdx = (endIdx + startIdx) / 2;

                if (findTarget < arr[midIdx]) {
                    endIdx = midIdx - 1;
                } else if (findTarget > arr[midIdx]) {
                    startIdx = midIdx + 1;
                } else if (findTarget == arr[midIdx]) {
                    find = true;
                    break;
                }
            }
            System.out.println(find ? "1" : "0");
        }
    }
}