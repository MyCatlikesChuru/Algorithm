import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int total = my_str.length() / n; 
        int remain = my_str.length() % n;
        if(remain != 0) total += 1;
        String[] answer = new String[total];
        for(int i=0; i<total; i++) {   
            if(remain != 0 && i==total-1) {
                answer[i] = my_str.substring(i*n,(i*n)+remain);
            } else {
                answer[i] = my_str.substring(i*n,(i*n)+n);
            }
        }
        return answer;
    }
}