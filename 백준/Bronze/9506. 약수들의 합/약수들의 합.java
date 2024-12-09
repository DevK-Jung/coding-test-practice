import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == -1) break;

            List<Integer> list = new ArrayList<>();
            int tmp = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    tmp += i;
                }
            }
            if (tmp == n) {
                System.out.print(n + " = ");

                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));

                    if (i != list.size() - 1) System.out.print(" + ");
                }
            } else {
                System.out.print(n + " is NOT perfect.");
            }

            System.out.println();
        }
    }
}