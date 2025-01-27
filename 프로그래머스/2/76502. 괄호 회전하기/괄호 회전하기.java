import java.util.*;

class Solution {
    public int solution(String s) {
        Map<Character, Character> map = Map.of(
                ')', '(',
                ']', '[',
                '}', '{'
        );

        int n = s.length();

        s += s;

        int answer = 0;

        a:
        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();

            for (int j = i; j < i + n; j++) {
                char c = s.charAt(j);

                if (!map.containsKey(s.charAt(j))) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c))) continue a;
                }
            }
            if (stack.isEmpty()) answer++;
        }

        return answer;
    }
}