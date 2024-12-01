import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException, IllegalAccessException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        double total = 0;
        double sc = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String subjects = st.nextToken();
            double g = Double.parseDouble(st.nextToken());
            String m = st.nextToken();

            if ("P".equals(m)) continue;

            total += g;
            double s = getScore(m);

            sc += g * s;
        }

        System.out.println(sc / total);
    }

    /**
     * A+	4.5
     * A0	4.0
     * B+	3.5
     * B0	3.0
     * C+	2.5
     * C0	2.0
     * D+	1.5
     * D0	1.0
     * F	0.0
     *
     * @param m
     * @return
     */
    private static double getScore(String m) throws IllegalAccessException {

        if ("A+".equals(m)) return 4.5;
        if ("A0".equals(m)) return 4.0;
        if ("B+".equals(m)) return 3.5;
        if ("B0".equals(m)) return 3.0;
        if ("C+".equals(m)) return 2.5;
        if ("C0".equals(m)) return 2.0;
        if ("D+".equals(m)) return 1.5;
        if ("D0".equals(m)) return 1.0;
        if ("F".equals(m)) return 0.0;

        throw new IllegalAccessException();
    }
}