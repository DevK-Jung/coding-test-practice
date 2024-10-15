import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 변수 N 에 과목의 수 입력 받기
        int N = sc.nextInt();

        // 최대값 max 선언
        int max = 0;
        // 합산 sum 선언
        int sum = 0;

        // for(N 만큼 반복) {
        //  최고점은 변수 max에, 총점은 변수 sum에 저장
        // }
        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();
            if (score > max) max = score;
            sum += score;
        }

        // 평균 계산 sum * 100 / max / N
        double result = sum * 100.0 / max / N; // double로 자동 변환시키기 위해 100.0을 곱해준다.

        System.out.println(result);
    }
}
