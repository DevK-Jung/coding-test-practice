import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        StringBuilder target = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {

            target.append(word.charAt(i));
        }

        System.out.println(target.toString().equals(word) ? 1 : 0);
    }
}