import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = 0;
        for (int i = 0; i < N; i++) {
            int target = sc.nextInt();

            int count = 1;
            for (int j = 2; j <= target; j++) {
                if (target % j == 0) {
                    count++;
                }
                if (count > 2) break;
            }

            if (count == 2) result++;
        }

        System.out.println(result);
    }
}