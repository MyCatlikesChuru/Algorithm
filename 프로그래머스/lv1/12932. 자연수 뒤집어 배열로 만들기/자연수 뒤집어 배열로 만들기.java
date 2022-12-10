class Solution {
    public int[] solution(long n) {
        String change = String.valueOf(n);
        int [] result = new int [change.length()];
        int num = 0;
        for(int i=change.length();i>0;i--){
            result[num] = Integer.parseInt(String.valueOf(change.charAt(i-1)));
            num++;
        }
        return result;
    }
}