import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int add = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
        int sub = Integer.parseInt(str[0])-Integer.parseInt(str[1]);
        int mul = Integer.parseInt(str[0])*Integer.parseInt(str[1]);
        int div = Integer.parseInt(str[0])/Integer.parseInt(str[1]);
        int remain = Integer.parseInt(str[0])%Integer.parseInt(str[1]);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(remain);
    }
}
