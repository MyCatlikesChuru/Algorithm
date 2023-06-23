class Solution {
    public int solution(int a, int b) {
        
        int first = Integer.parseInt(String.valueOf(a) + String.valueOf(b)); 
        int secound = 2 * a * b;
        
        
        return first > secound ? first : secound;
    }
}