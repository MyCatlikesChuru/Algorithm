import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strs = br.readLine().split(" ");
        int A = Integer.parseInt(strs[0]); // 낮에 올라가는 미터
        int B = Integer.parseInt(strs[1]); // 밤에 떨어지는 미터
        int V = Integer.parseInt(strs[2]); // 올라가야할 목적지
        int days;
        days = (V-B)/(A-B);
        if((V-B)%(A-B)!=0)days++;
        bw.write(String.valueOf(days));
        bw.flush();
        bw.close();
    }
}