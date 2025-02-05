import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<int[]>> genresMap = new HashMap<>();
        Map<String, Integer> genresTotalPlaysMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (!genresMap.containsKey(genres[i])) genresMap.put(genres[i], new ArrayList<>());

            genresMap.get(genres[i]).add(new int[]{i, plays[i]});

            genresTotalPlaysMap.put(genres[i], genresTotalPlaysMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        Stream<Map.Entry<String, Integer>> sorted = genresTotalPlaysMap.entrySet()
                .stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));

        List<Integer> answer = new ArrayList<>();
        sorted.forEach(entry -> {
            Stream<int[]> limit = genresMap.get(entry.getKey())
                    .stream()
                    .sorted((o1, o2) -> Integer.compare(o2[1], o1[1]))
                    .limit(2);

            limit.forEach(v -> answer.add(v[0]));
        });

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}