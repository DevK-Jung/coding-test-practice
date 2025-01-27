import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public static final Map<Character, int[]> CONTROL = Map.of(
            'U', new int[]{0, 1},
            'D', new int[]{0, -1},
            'R', new int[]{1, 0},
            'L', new int[]{-1, 0}
    );

    public int solution(String dirs) {

        int[] init = new int[]{5, 5};

        Set<String> set = new HashSet<>();

        int x = 5, y = 5;

        for (char c : dirs.toCharArray()) {
            int[] move = CONTROL.get(c);

            int nx = x + move[0];
            int ny = y + move[1];

            if (overRange(nx, ny)) continue;

            set.add(x + " " + y + " " + nx + " " + ny);
            set.add(nx + " " + ny + " " + x + " " + y);

            x = nx;
            y = ny;
        }

        return set.size() / 2;
    }

    private boolean overRange(int nx, int ny) {
        return nx < 0 || nx > 10 || ny < 0 || ny > 10;
    }
}