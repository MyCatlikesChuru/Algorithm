import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0;
        for(int i=0;i<T;i++){
            result += str.charAt(i)-'0';
        }
        System.out.println(result);
    }
}