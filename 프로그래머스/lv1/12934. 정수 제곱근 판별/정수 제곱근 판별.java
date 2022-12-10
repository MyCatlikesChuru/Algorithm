class Solution {
    public long solution(long n) {
        double root = Math.sqrt(n);
        return Math.floor(root)==root ?(long)Math.pow((long)root + 1, 2) : (long)-1;
    }
}