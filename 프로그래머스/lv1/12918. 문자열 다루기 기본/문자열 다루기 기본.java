class Solution {
    public boolean solution(String s) {
               int result = 0;
        char [] num = {'0','1','2','3','4','5','6','7','8','9'};
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i)>='A' && s.charAt(i)<='z'){
                System.out.println("문자열이 있습니다.");
                return false;
            }else{
                for(int j=0;j<num.length;j++){
                    if(s.charAt(i)==num[j]){
                        result++;
                    }
                }
            }

        }
        return result == 4 || result == 6 ? true : false;
    }
}