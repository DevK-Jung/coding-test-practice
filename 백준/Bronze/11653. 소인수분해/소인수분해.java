import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int start = 2;
        while (N != 1) {

            if (N % start == 0) {
                N = N / start;
                System.out.println(start);
            } else {
                start++;
            }
        }
    }
}