import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static boolean isEven;
    public static boolean[] visited;

    public static int[] checked;
    public static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {

            String[] split = br.readLine().split(" ");

            int V = Integer.parseInt(split[0]);
            int E = Integer.parseInt(split[1]);

            visited = new boolean[V + 1];
            checked = new int[V + 1];
            isEven = true;
            arr = new ArrayList[V + 1];

            for (int j = 1; j <= V; j++) {
                arr[j] = new ArrayList<>();
            }

            for (int j = 0; j < E; j++) {

                split = br.readLine().split(" ");

                int start = Integer.parseInt(split[0]);
                int end = Integer.parseInt(split[1]);

                arr[start].add(end);
                arr[end].add(start);
            }

            for (int j = 1; j <= V; j++) {
                if (isEven) {
                    DFS(j);
                } else {
                    break;
                }
            }

            System.out.println(isEven ? "YES" : "NO");
        }
    }

    private static void DFS(int i) {
        visited[i] = true;
        for (int a : arr[i]) {
            if (!visited[a]) {
                checked[a] = (checked[i] + 1) % 2;
                DFS(a);
            } else if(checked[a] == checked[i]){
                isEven = false;
                break;
            }
        }
    }
}