class Solution {
    boolean solution(String s) {
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == 'P' || s.charAt(i) == 'p') cnt1 += 1;
            if (s.charAt(i) == 'Y' || s.charAt(i) == 'y') cnt2 += 1;
        }
        return cnt1 == cnt2 ? true : false;
    }
}