import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] split = str.split("-");

        int result = 0;

        for (int i = 0; i < split.length; i++) {
            int value = sum(split[i]);

            if (i == 0) {
                result += value;
            } else {
                result -= value;
            }
        }
        System.out.println(result);
    }

    public static int sum(String target) {
        String[] splits = target.split("[+]");

        int result = 0;

        for (String split : splits) {
            result += Integer.parseInt(split);
        }
        return result;
    }
}