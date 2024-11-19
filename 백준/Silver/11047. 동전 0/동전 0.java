import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] <= K) {
                count += K / a[i];
                K = K % a[i];
            }
        }

        System.out.println(count);
    }
}