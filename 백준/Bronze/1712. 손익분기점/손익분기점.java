import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strs = br.readLine().split(" ");
        int A = Integer.parseInt(strs[0]);
        int B = Integer.parseInt(strs[1]);
        int C = Integer.parseInt(strs[2]);

        if(B>=C) System.out.println(-1);
        else System.out.println((A/(C-B))+1);
//        bw.write(String.valueOf(cnt));
//        bw.flush();
        //bw.close();
    }
}