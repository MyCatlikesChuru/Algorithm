import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = sc.nextInt();
        int[] result = new int[T];
        for(int i=0; i<T; i++){
            result[i] = sc.nextInt();
        }
        Arrays.sort(result);
        for(int j=0; j<T; j++){
            System.out.println(result[j]);
        }
    }
}