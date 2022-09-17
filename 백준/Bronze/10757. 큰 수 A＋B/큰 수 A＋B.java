import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        BigInteger bigNumber1 = new BigInteger(strs[0]);
        BigInteger bigNumber2 = new BigInteger(strs[1]);
        System.out.println(bigNumber1.add(bigNumber2));
    }
}