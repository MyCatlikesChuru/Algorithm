class Solution {
    public long solution(int price, int money, int count) {
     long sum = 0;
        long result = 0;
        for (int i =0; i < count; i++) {
            sum += (long)price*(i+1);
        }
        result = sum-money;
        return result >=0 ? result : 0;
    }
}