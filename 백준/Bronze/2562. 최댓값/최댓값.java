import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int count = 0;

        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (max < arr[i]) max = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                count = i + 1;
                break;
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}