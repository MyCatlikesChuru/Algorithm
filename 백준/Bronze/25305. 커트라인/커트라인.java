import java.io.IOException;
import java.util.Arrays;
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
        Arrays.sort(score);
        System.out.println(score[score.length-k]);
    }
}