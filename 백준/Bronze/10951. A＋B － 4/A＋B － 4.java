import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        String str;
        while( (str=br.readLine()) != null){
            int A = str.charAt(0) - 48;
            int B = str.charAt(2) - 48;
            result += (A+B)+"\n";
        }
        System.out.println(result);
    }
}