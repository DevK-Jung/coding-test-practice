import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;


class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> _cards1 = new ArrayDeque<>(Arrays.asList(cards1));
        Queue<String> _cards2 = new ArrayDeque<>(Arrays.asList(cards2));
        Queue<String> _goal = new ArrayDeque<>(Arrays.asList(goal));

        for (int i = 0; i < goal.length; i++) {
            String g = _goal.peek();

            if (!_cards1.isEmpty() && _cards1.peek().equals(g)) {
                _cards1.poll();
                _goal.poll();
                continue;
            }
            if (!_cards2.isEmpty() && _cards2.peek().equals(g)) {
                _cards2.poll();
                _goal.poll();
                continue;
            }

            break;
        }

        return _goal.isEmpty() ? "Yes" : "No";
    }
}