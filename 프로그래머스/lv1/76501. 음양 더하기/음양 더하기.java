class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int result=0;
        int num=0;
        boolean sign;
        for(int i=0;i<absolutes.length;i++){
            num = absolutes[i];
            sign = signs[i];
            if(sign){
                result = result+(num*1);
            }else if(!sign){
                result = result+(num*-1);
            }
        }
        return result;
    }
}