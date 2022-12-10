class Solution {
    public String solution(int a, int b) {
        String day[] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int month[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        String result = "";
        int result_day = 0;
        for(int i=1; i<a; i++){
            result_day += month[i-1];
        }
        result_day += b;
        return day[(result_day)%7];
    }
}