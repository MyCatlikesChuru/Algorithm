import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; // 반환할 배열
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            // 값이 떨어지는 주식의 시간을 저장
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek(); // 반환배열에 떨어지는 시간 초 저장
                stack.pop(); // 값이 떨어진 초는 제거
            }
            stack.push(i); // 값이 떨어지지않은 주식의 시간초를 저장
        }

        while (!stack.isEmpty()) {
            // 값이 떨어지지않은 주식들, 마지막 인덱스부터 차례대로 빼오기
            Integer last = stack.pop();
            answer[last] = prices.length - last - 1;
        }
        return answer;
    }
}