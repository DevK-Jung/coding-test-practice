import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int cookingTime = sc.nextInt();

        int A = hour * 60 + min; // 현재 시간 (분으로 환산)

        int result = cookingTime + A;

        int resultHour = result / 60 % 24;

        int resultMin = result % 60;

        System.out.println(resultHour + " " + resultMin);
    }

}