import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // O(N^3)
        // N! / (N-r)! * r!
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        System.out.println((N - 2) * (N - 1) * N / 6);
        System.out.println(3);
    }
}