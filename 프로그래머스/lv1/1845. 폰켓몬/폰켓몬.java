import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int half = (int) nums.length / 2 ;
        
        for(Integer num : nums){
            map.put(num,1);
        }
        
        
        return (map.size() > half) ? half : map.size();
    }
}