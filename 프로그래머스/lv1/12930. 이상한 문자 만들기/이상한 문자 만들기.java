class Solution {
    public String solution(String s) {
        String result = "";
        int num = 0;
        String[] arr = s.split("");
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals(" ")){
                result += num%2==0 ? arr[i].toUpperCase() : arr[i].toLowerCase();
                num++;
            }else {
                num=0;
                result += " ";
            }
        }
        return result;
    }
}