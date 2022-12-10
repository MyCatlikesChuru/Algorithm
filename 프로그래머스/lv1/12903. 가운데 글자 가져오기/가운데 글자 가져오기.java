class Solution {
    public String solution(String s) {
        String result = "";
        int str_1 = (s.length()/2)-1;
        int str_2 = str_1+2;
        if (s.length() % 2 == 0) {
            result = s.substring(str_1,str_2); //짝수
        } else {
            result = Character.toString(s.charAt(str_1+1)); //홀수
        }
        return result;
    }
}