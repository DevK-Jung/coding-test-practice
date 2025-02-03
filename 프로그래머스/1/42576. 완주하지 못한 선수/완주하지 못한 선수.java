import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> completionMap = new HashMap<>();

        Arrays.stream(completion)
                .forEach(v -> completionMap.put(v, completionMap.getOrDefault(v, 0) + 1));

        for (String part : participant) {
            if (completionMap.getOrDefault(part, 0) == 0) return part;

            completionMap.put(part, completionMap.get(part) - 1);
        }

        return null;
    }
}