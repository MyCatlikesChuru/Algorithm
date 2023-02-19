import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 문제의 핵심
        // 높은 숫자가 중요도가 높은 것이다.
        // 대기문서에서 꺼낸 문서가 대기열에 있는 문서보다 중요도가 낮으면 맨뒤로간다.
        Queue<Integer> important = new LinkedList<>(); // 우선순위 Queue
        Queue<Integer> document = new LinkedList<>(); // 문서 Queue
        List<Integer> result = new ArrayList<>(); // 프린트를 완료한 List
        int answer = 0;

        // 우선순위를 queue에 담음
        for (int i=0; i<priorities.length; i++) {
            document.add(i);
            important.add(priorities[i]);
        }

        while (important.size()!=0) {
            Integer print = important.poll(); // 대기열의 문서를 하나씩 빼온다
            Integer target = document.poll();
            int maxDoc = 0;
            if(important.size()>=1){
                maxDoc = important.stream().mapToInt(i -> i).max().getAsInt(); // 현재 우선순위가 가장 높은 숫자
            }
            if(print >= maxDoc) {
                result.add(target); // 우선순위가 높을경우 프린트 완료한
            } else {
                important.add(print); // 우선순위가 아닐경우 마지막에 넣는다
                document.add(target);
            }
        }


        return result.indexOf(location) + 1;
    }
}