import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1;
        boolean success = true;

        for (int i = 0; i < n; i++) {
            int inputNum = A[i];

            if (inputNum >= num) {
                while (inputNum >= num) {
                    stack.push(num);
                    sb.append("+\n");
                    num++;
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int pop = stack.pop();
                if (pop > inputNum) {
                    System.out.println("NO");
                    success = false;
                    break;
                }
                sb.append("-\n");
            }
        }

        if (success) System.out.println(sb);
    }
}