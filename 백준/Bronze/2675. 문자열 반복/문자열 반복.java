import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String[] strs = br.readLine().split(" ");
            String result = "";
            int repeat = Integer.parseInt(strs[0]);
            for(int j=0; j<strs[1].length(); j++){
                for(int k=0; k<repeat; k++){
                    result += strs[1].charAt(j);
                }
            }
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }
}