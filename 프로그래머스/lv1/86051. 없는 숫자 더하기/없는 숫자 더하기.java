class Solution {
    public int solution(int[] numbers) {
        int result = 0;
        for(int i=0;i<=9;i++) {
            for(int j=1;j<=numbers.length;j++) {
                if(i==numbers[j-1]){
                    break;
                }
                if(j==numbers.length){
                    result += i;
                }
            }
        }
        return result;
    }
}