import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int firstTarget = sc.nextInt();
            int secondTarget = sc.nextInt();

            int temp = arr[firstTarget];
            arr[firstTarget] = arr[secondTarget];
            arr[secondTarget] = temp;
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
