import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N 값 입력받기
        int n = sc.nextInt();

        // 길이 N의 숫자를 입력받아 String 으로 변수(sNum)에 저장
        String sNum = sc.next();

        // sNum을 char[] (cNum)형태로 변환
        char[] cNum = sNum.toCharArray();

        // sum 한 값 담을 int 형 변수 선언
        int result = 0;

        // for(cNum 길이)
        for (int i = 0; i < cNum.length; i++) {
            // 배열의 각 자릿값을 정수형 변환하여 sum에 더하기(char '1'과 int 1은 48 만큼 차이 48을 빼주거나, '0'을 빼준다.
            result += cNum[i] - '0';
        }

        // sum 값 출력
        System.out.println(result);
    }
}
