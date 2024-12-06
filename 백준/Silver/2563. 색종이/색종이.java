import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        int[][] paper = new int[100][100];

        int result = 0;

        for (int t = 0; t < testCase; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    if (paper[i][j] == 1) {
                        continue;
                    }
                    paper[i][j] = 1;
                    result += 1;
                }
            }
        }

        System.out.println(result);

    }
}