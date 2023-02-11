import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 참가자를 카운팅으로 그룹핑 시켜 Map으로 반환
        Map<String, Long> hashMap = Arrays.stream(participant)
                .collect(Collectors.groupingBy(person -> person, Collectors.counting()));

        // 완주자 목록으로 참가자를 비교해 Map에서 제거하기
        Arrays.stream(completion)
                .forEach(person -> {
                            if (hashMap.get(person) == 1L) hashMap.remove(person);
                            else hashMap.put(person, hashMap.get(person) - 1);
                        });
        return hashMap.keySet().iterator().next();
    }
}