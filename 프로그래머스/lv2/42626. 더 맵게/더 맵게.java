import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int mixedCount = 0;

        // 배열의 항목을 우선순위 큐에 담음
        for (int i : scoville) {
            heap.add(i);
        }

        while (heap.peek() < K) {
            if (heap.size() == 1) {
                return -1;
            }
            int first = heap.poll(); // 가장 덜매운 것
            int secound = heap.poll(); // 그다음 매운 것
            int mix = first + (secound * 2);
            mixedCount++;
            heap.offer(mix);
        }
        return mixedCount;
    }
}