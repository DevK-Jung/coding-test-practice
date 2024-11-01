import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 10;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt() % 42);
        }

        System.out.println(set.size());
    }
}