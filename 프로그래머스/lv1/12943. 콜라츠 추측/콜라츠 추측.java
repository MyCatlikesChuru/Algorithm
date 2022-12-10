class Solution {
    public int solution(int num) {        
        int result = 0;
        long sum = num;
        //System.out.println("들어온 값:"+sum);
        if(sum>1){
            for(int i=0; i<500; i++) {
                if (sum % 2 == 0){
                    sum /= 2;
                    result++;
                    //System.out.println("짝수진행/ "+(i+1)+"회차 :"+sum);
                }
                else if (sum % 2 != 0) {
                    sum = (sum * 3) + 1;
                    result++;
                    //System.out.println("홀수진행/ "+(i+1)+"회차 :"+sum);
                }
                if (sum==1) break;
            }
        }
        return sum==1 ? result : -1;
    }
}