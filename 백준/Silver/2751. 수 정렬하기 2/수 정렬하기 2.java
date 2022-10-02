import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] result = new int[T];
        for(int i=0; i<T; i++){
            result[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(result);
        for(int j=0; j<T; j++){
            bw.write(result[j]+"\n");
        }
        bw.flush();
        bw.close();
    }
}