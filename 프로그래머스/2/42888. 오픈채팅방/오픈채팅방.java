import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> messageMap = Map.of(
                "Enter", "님이 들어왔습니다.",
                "Leave", "님이 나갔습니다."
        );

        HashMap<String, String> nameMap = new HashMap<>();

        for (String r : record) {
            String[] split = r.split(" ");

            if (!"Leave".equals(split[0])) nameMap.put(split[1], split[2]);
        }

        List<String> messages = new ArrayList<>();
        for (String r : record) {
            String[] split = r.split(" ");

            if (messageMap.containsKey(split[0]))
                messages.add(nameMap.get(split[1]) + messageMap.get(split[0]));
        }

        return messages.toArray(new String[0]);
    }
}