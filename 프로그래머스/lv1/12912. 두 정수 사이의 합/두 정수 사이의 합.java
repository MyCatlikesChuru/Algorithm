class Solution {
    public long solution (int a,int b){
        long sum = 0;
        int c = a;
        int d = b;
        if(c>d) {
            c = b;
            d = a;
        }
        for(int i=c;i<=d;i++){
            sum = sum+i;
        }
        return sum;
    }
}