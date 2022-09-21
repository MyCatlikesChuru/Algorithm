import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subject = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ") ;
        int[] score = new int[strs.length];
        for(int i=0; i<score.length; i++){
            score[i] = Integer.parseInt(strs[i]);
        }
        int max = Arrays.stream(score).max().getAsInt();
        double average = Arrays.stream(score)
                .mapToDouble(i->(i /(double)max)*100)
                .sum()/subject;
        System.out.println(average);
    }
}