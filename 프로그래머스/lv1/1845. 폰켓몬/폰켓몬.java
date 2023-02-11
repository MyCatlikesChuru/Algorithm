import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int max = nums.length / 2 ;
        Set<Integer> hashSet = new HashSet<>();
        Arrays.stream(nums).forEach(num -> hashSet.add(num));
        return (hashSet.size() > max) ? max : hashSet.size();
    }
}