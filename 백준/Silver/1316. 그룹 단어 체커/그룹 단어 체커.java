import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String target = st.nextToken();

            boolean[] check = new boolean[26];

            int prev = -1;

            boolean groupWord = true;

            for (int j = 0; j < target.length(); j++) {
                int now = target.charAt(j) - 'a';

                if (now == prev) continue; //  그룹코드

                prev = now;

                if (check[now]) {
                    groupWord = false;
                    break;
                } else {
                    check[now] = true;
                }
            }

            if (groupWord) result++;
        }

        System.out.println(result);
    }
}