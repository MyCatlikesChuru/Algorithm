import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while(true){
            String[] strs = br.readLine().split(" ");
            int A = Integer.parseInt(strs[0]);
            int B = Integer.parseInt(strs[1]);
            if(A==0&&B==0) break;
            result += (A+B)+"\n";
        }
        System.out.println(result);
    }
}