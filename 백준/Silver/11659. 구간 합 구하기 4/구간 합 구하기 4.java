import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 수의 개수(suNo) 합을 구해야 하는 횟수(quizNo) 받기
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken()); // 수의 갸수
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 질의 개수

        long[] S = new long[suNo + 1]; // 합배열 초기화 문제와 index 맞추기위해 + 1

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= suNo; i++) { // 합 배열 구하기 S[i] = S[i-1] + A[i]
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());;
        }

        for (int q = 0; q < quizNo; q++) { // 구간합 구하기 S = S[j] - S[i-1]
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(S[j] - S[i - 1]);
        }
    }
}
