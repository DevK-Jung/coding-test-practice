import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> receiveCntMap = new HashMap<>();

        Arrays.stream(id_list)
                .forEach(id -> receiveCntMap.put(id, 0));

        Map<String, Set<String>> reportMap = new HashMap<>();

        for (String s : report) {
            String[] split = s.split(" ");
            String reporter = split[0];
            String receiver = split[1];

            if (!reportMap.containsKey(receiver)) reportMap.put(receiver, new HashSet<>());

            reportMap.get(receiver).add(reporter);
        }

        for (Set<String> reportSet : reportMap.values()) {
            if (reportSet.size() < k) continue;

            reportSet.forEach(v -> receiveCntMap.put(v, receiveCntMap.getOrDefault(v, 0) + 1));
        }

        int[] answer = new int[id_list.length];

        IntStream.range(0, id_list.length)
                .forEach(idx -> answer[idx] = receiveCntMap.get(id_list[idx]));

        return answer;
    }
}