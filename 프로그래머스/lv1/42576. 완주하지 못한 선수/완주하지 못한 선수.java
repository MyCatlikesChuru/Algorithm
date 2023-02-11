import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hashMap = new HashMap<>();

        // 참가자 체크 (동명인이 있을 경우 value값 1씩 증가)
        Arrays.stream(participant)
                .forEach(person -> hashMap.put(person, hashMap.getOrDefault(person,0)+1));

        // 완주자 체크 (참가자 중 완주한 사람은 value값을 1씩 감소)
        Arrays.stream(completion)
                .forEach(person -> hashMap.put(person, hashMap.get(person)-1));

        // 값이 0이 아닐경우는 완주하지 못한 것으로 간주
        for(String key : hashMap.keySet()){
            if(hashMap.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}