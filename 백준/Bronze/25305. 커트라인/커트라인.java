import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] score = new int[N]; // 1<= N <= 1000 : 1000개의 경우의수
        int[] count = new int[10001]; // 0<= x <= 10000 : 수의 범위 0~10000까지
        int[] result = new int[N]; // 최종 정렬된 배열
        for(int i=0; i<N; i++){
            score[i] = sc.nextInt();
        }
        //카운팅 정렬 사용해보기
        //각각 배열에 값을 카운트 배열에 카운트하기 ex) score[0]의 요소가 100이면 count[100]의 1씩증가.
        for(int i=0; i<score.length; i++){
            count[score[i]]++;
        }
        //누적 합 해주기
        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }
        //i번째 원소에 1씩 감소시킨후 결과 배열에 저장
        //뒤에서부터 정렬할 수록 좋다
        for(int i=score.length-1; i>=0; i--){
            int value = score[i];
            count[value]--;
            result[count[value]] = value;
        }
        System.out.println(result[result.length-k]);
    }
}