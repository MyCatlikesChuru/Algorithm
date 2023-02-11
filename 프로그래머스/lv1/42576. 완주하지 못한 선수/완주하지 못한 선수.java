import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hashMap = new HashMap<>();

        Arrays.stream(participant)
                .forEach(person -> hashMap.put(person, hashMap.getOrDefault(person,0)+1));
        Arrays.stream(completion)
                .forEach(person -> hashMap.put(person, hashMap.get(person)-1));
        for(String key : hashMap.keySet()){
            if(hashMap.get(key) != 0) answer = key;
        }
        return answer;
    
    }
}