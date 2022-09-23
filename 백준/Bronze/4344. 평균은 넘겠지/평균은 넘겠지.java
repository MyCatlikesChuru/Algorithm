import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String[] strs = br.readLine().split(" ");
            double allAverage = 0;
            int[] buffer = new int[strs.length-1];
            for(int j=1; j<strs.length;j++){
                buffer[j-1] = Integer.parseInt(strs[j]);
                allAverage += Double.parseDouble(strs[j]);
            }
            double finalAllAverage = allAverage / Integer.parseInt(strs[0]);
            int count = (int)Arrays.stream(buffer).mapToDouble(s->s).filter(s -> s > finalAllAverage).count();
            double result = (double)100/Integer.parseInt(strs[0]) * count;
            bw.write(String.format("%.3f",result)+"%"+"\n");
        }
        bw.flush();
        bw.close();
    }
}