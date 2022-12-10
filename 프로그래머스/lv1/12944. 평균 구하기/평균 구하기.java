class Solution {
    public double solution(int[] arr) {
        double result = 0;
        for(int i=0;i<arr.length;i++){
            result+= arr[i];
        }
        return result/arr.length;
    }
}