import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 바구니 수
        int M = Integer.parseInt(st.nextToken()); // 공 넣을 횟수

        int[] arr = new int[N + 1]; // 바구니 배열

        for (int count = 0; count < M; count++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            while (i <= j) {
                arr[i] = k;
                i++;
            }
        }

        for (int count = 1; count < arr.length; count++) {
            System.out.print(arr[count] + " ");
        }
    }
}