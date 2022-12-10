import java.util.*;

public class Solution {
    public int solution(int n) {
        int result = 0;
        String arr = String.valueOf(n);
        for(int i=0;i<arr.length();i++){
            result += Integer.parseInt(String.valueOf(arr.charAt(i)));
        }
        return result;
    }
}