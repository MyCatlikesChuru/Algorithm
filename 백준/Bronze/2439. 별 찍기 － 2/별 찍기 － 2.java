import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String [] abc = new String[num];
        String result = "";
        for(int i=0;i<num;i++){
            abc[i] = " ";
        }
        for(int i=num-1;i>=0;i--){
            abc[i] = "*";
            result = String.join("",abc);
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }
}