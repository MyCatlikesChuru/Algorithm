import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 1;
        int remain = 0;
        int other = 0;
        boolean even = false;
        for(int i=1;i<num;i+=cnt){
            even = !even;
            remain = num-i;
            cnt++;
            other = cnt-remain+1;
        }
        if(num==1) System.out.println("1/1");
        else if(!even){
            System.out.println(String.format("%d/%d",other,remain));
        }else {
            System.out.println(String.format("%d/%d",remain,other));
        }
    }
}