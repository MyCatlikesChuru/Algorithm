import java.util.*;

class Solution {
    public String solution(String s) {
        
        String[] strs = s.split(" ");
        int max = Arrays.stream(strs).mapToInt(i -> Integer.parseInt(i)).max().orElse(0);
        int min = Arrays.stream(strs).mapToInt(i -> Integer.parseInt(i)).min().orElse(0);  
      
        return min + " " + max;
    }
}