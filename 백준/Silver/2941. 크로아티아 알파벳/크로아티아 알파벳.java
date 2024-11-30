import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> c = new ArrayList<>();

        c.add("c=");
        c.add("c-");
        c.add("dz=");
        c.add("d-");
        c.add("lj");
        c.add("nj");
        c.add("s=");
        c.add("z=");

        String target = sc.next(); // 대문자로 변경

        for (String t : c) {
            if (target.contains(t)) {
                target = target.replace(t, "|");
            }
        }
        System.out.println(target.length());
    }
}