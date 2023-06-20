class Solution {
    public int solution(int a, int b) {
        int result1 = Integer.parseInt(this.intToString(a,b));
        int result2 = Integer.parseInt(this.intToString(b,a));
        return result1 > result2 ? result1 : result2;
    }
    
    private String intToString(int i1, int i2) {
        return String.valueOf(i1) + String.valueOf(i2);
    }
    
}