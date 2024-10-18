import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();// N 받기

        // 변수 초기화(count, startPoint, endPoint, sum)
        int count = 1;
        int startPoint = 1;
        int endPoint = 1;
        int sum = 1;

        while (endPoint != N) {
            if (sum == N) {
                count++;
                endPoint++;
                sum += endPoint;
            } else if (sum > N) {
                sum -= startPoint;
                startPoint++;
            } else if (sum < N) {
                endPoint++;
                sum += endPoint;
            }
        }

        System.out.println(count);
    }
}