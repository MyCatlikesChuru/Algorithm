import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] supojaOne = new int[]{1, 2, 3, 4, 5};
        int[] supojaTwo = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] supojaThree = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if(supojaOne[i % supojaOne.length] == answers[i]) answer[0]++;
            if(supojaTwo[i % supojaTwo.length] == answers[i]) answer[1]++;
            if(supojaThree[i % supojaThree.length] == answers[i]) answer[2]++;
        }

        int max = Arrays.stream(answer).max().getAsInt();

        for (int j = 0; j < answer.length; j++) {
            if(answer[j] == max) answer[j] = j+1;
            else answer[j] = 0;
        }
        return Arrays.stream(answer).filter(i -> i > 0).toArray();
    }
}