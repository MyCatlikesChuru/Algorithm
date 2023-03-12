import java.util.*;

class Solution {
    public int solution(String numbers) {
        // 만들수 있는 조합 중 소수의 갯수를 구하는 문제
        // String 길이가 달라지기 때문에 재귀로 풀어야하는 문제
        String[] arr = numbers.split("");
        boolean[] visit = new boolean[arr.length];
        Set<Integer> combination =  new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            recursion(arr, arr[i], combination, i, visit);
            visit[i] = false;
        }

        return combination.size();
    }
    
     public void recursion(String[] numbers, String number, Set<Integer> combination, int index, boolean[] visit) {
        visit[index] = true; // 해당 index 재귀 호출시 방문 체크
        int num = Integer.parseInt(number);
        if(isPrime(num)) combination.add(num);
        if(number.length() == numbers.length) return;

        for (int i = 0; i < numbers.length; i++) {
            if(!visit[i]) {
                recursion(numbers, number + numbers[i],combination, i, visit);
                visit[i] = false;
            }
        }
    }

    public boolean isPrime(int num) {
        if (num == 2) return true;
        if (num % 2 == 0 || num == 1) return false;
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}