import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String result = "";
        for(int i=0;i<num;i++){
            result += "*";
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }
}