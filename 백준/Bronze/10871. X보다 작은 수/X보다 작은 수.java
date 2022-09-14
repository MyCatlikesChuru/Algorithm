import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int X = Integer.parseInt(strs[1]);

        String result = "";
        String[] strs2 = br.readLine().split(" ");

        for(int i=0;i<N;i++){
            int A = Integer.parseInt(strs2[i]);
            if(X>A) result += A+" ";
        }
        System.out.println(result);
    }
}