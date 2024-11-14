import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[][] A;
    static boolean[][] visited;
    static int[] bx = new int[]{0, 1, 0, -1};
    static int[] by = new int[]{1, 0, -1, 0};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < M; j++) {
                int value = Integer.parseInt(s.substring(j, j + 1));
                A[i][j] = value;
            }
        }

        BFS(0, 0);

        System.out.println(A[N - 1][M - 1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{i, j});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int k = 0; k < 4; k++) {
                int x = now[0] + bx[k];
                int y = now[1] + by[k];

                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (A[x][y] != 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}