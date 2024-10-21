import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 재료의 수
        int M = Integer.parseInt(br.readLine()); // 갑옷을 만드는데 필요한 수

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine()); // 고유 번호들

        int[] A = new int[N]; // 재료들 고유한 번호를 담을 배열 초기화

        for (int i = 0; i < N; i++) { // 재료의 수 만큼 반복
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(A); // 정렬

        int i = 0, count = 0, j = N - 1; // 초기화

        while (i < j) {
            if (A[i] + A[j] < M) i++;
            else if (A[i] + A[j] > M) j--;
            else {
                count++;
                i++;
                j--;
            }
        }

        System.out.println(count);
    }
}
