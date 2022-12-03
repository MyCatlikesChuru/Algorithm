import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int answer = 0;
        int half = (int) nums.length / 2 ;
        Set<Integer> hashSet = new HashSet<>();
        
        for(Integer num : nums){
            hashSet.add(num);
        }
        
        return (hashSet.size() > half) ? half : hashSet.size();
    }
}