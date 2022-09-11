import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int beehive = Integer.parseInt(br.readLine());
        int cnt = 1;
        if(beehive==1) System.out.println(1);
        else if(beehive>1&&beehive<7) System.out.println(2);
        else {
            for(int i=7;i<beehive;i+=6*cnt){
                cnt++;
            }
            System.out.println(cnt+1);
        }
    }
}