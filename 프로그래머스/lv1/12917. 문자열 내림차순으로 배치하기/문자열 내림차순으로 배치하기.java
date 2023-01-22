import java.util.*;

class Solution {
    public String solution(String s) {
        char[] buffer = s.toCharArray();
        Arrays.sort(buffer);
        return new StringBuilder(new String(buffer)).reverse().toString();
    }
}