import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int maxR = 0;
        int maxC = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int value = sc.nextInt();

                if (value >= max) {
                    max = value;
                    maxR = i;
                    maxC = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxR + " " + maxC);
    }
}