import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String ctos = String.valueOf(n); //n자연수값 String 문자열변환
        String [] arr = new String [ctos.length()]; //문자열길이만큼 배열생성
        String result = ""; //change to integer 변수생성
        for(int i=0;i<arr.length;i++){
            arr[i] = String.valueOf(ctos.charAt(i)); //문자열의 단어하나씩 arr배열에저장
        }
        Arrays.sort(arr, Collections.reverseOrder()); // arr배열 내림차순 지정
        for(int j=0;j<arr.length;j++){
            result += arr[j]; //String으로된 result값에 arr[i]값 한개씩 붙여넣음
        }
        return Long.parseLong(result); //String to long으로 형변환후 리턴
    }
}