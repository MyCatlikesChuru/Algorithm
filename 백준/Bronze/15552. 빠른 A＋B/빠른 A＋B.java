import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        for(int i=0;i<number;i++){
            String[] strs = br.readLine().split(" ");
            int frt = Integer.parseInt(strs[0]);
            int sec = Integer.parseInt(strs[1]);
            bw.write(frt+sec+"\n");
        }
        bw.flush();
        bw.close();
    }
}
