import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int count = 0, result = 0;

        for(int i=0; i<T; i++){
            String[] strs = br.readLine().split("");
            for(String s : strs){
                if(s.equals("O")){
                    count += 1;
                }else{
                    count = 0;
                }
                result += count;
            }
            bw.write(String.valueOf(result+"\n"));
            count = 0;
            result = 0;
        }
        bw.flush();
        bw.close();
    }
}