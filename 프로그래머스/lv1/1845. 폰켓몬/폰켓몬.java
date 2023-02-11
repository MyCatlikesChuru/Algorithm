import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 골라야하는 폰켓몬 수, 즉 종류가 서로다를 경우 최대 종류의 개수
        int max = nums.length / 2 ;

        // 같은 종류의 폰켓몬은 제거한 후 hash로 저장
        Set<Integer> hashSet = new HashSet<>();
        Arrays.stream(nums).forEach(num -> hashSet.add(num));

        // 중복이 제거된 폰켓몬 종류가 최대 종류의 개수보다 많을 경우 -> 최대종류의 개수 리턴
        // 중복이 제거된 폰켓몬 종류가 최대 종류의 개수보다 적을 경우 -> 적은종류의 개수 리턴
        return (hashSet.size() > max) ? max : hashSet.size();
    }
}