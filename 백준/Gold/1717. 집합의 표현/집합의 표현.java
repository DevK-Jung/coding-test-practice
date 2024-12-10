import java.util.Scanner;

public class Main {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int type = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (type == 0) {
                union(a, b);
            } else {
                int c = find(a);
                int d = find(b);

                System.out.println(c == d ? "YES" : "NO");
            }
        }
    }

    private static int find(int target) {
        if (arr[target] == target) return target;

        return arr[target] = find(arr[target]);
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if(b != a) arr[b] = a;
    }
}