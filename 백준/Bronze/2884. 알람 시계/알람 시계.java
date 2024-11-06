import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min < 45) {
            hour--;
            min = 60 - (45 - min);

            if (hour == -1) hour = 23;

            System.out.println(hour + " " + min);

        } else {

            System.out.println(hour + " " + (min - 45));
        }
    }

}