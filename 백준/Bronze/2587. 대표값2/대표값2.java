import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            arr[i] = value;
            sum += value;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(sum / n);
        System.out.println(arr[2]);
    }
}