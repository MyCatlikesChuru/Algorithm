import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // commands의 [i,j,k] 원소를 가진다.
        // 반환할 배열을 만든다.
        int[] answer = new int[commands.length];

        // commands 배열 길이만큼 순회를 한다.
        for (int i=0; i<commands.length; i++) {
            int[] cutArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            if(cutArray.length >=2) Arrays.sort(cutArray);
            answer[i] = cutArray[commands[i][2]-1];
        }
        
        return answer;
    }
}