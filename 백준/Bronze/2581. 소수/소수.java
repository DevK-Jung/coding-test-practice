import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int min = -1;

        for (int i = M; i <= N; i++) {

            int count = 1;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 2) break;
            }

            if (count == 2) {
                sum += i;
                if (min == -1) min = i;
            }
        }

        if (min != -1) System.out.println(sum);
        System.out.println(min);
    }
}