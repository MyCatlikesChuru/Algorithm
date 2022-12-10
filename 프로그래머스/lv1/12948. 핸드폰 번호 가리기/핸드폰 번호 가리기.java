class Solution {
    public String solution(String phone_number) {
        char[] result = phone_number.toCharArray();
        for(int i=0;i<phone_number.length()-4;i++){
            result[i] = '*';
        }
        return String.valueOf(result);
    }
}