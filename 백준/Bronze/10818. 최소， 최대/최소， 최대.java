import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");

        int maxNumber = Arrays.stream(strs)
                .mapToInt(s -> Integer.parseInt(s))
                .max()
                .orElse(0);
        int minNumber = Arrays.stream(strs)
                .mapToInt(s -> Integer.parseInt(s))
                .min()
                .orElse(0);
        System.out.println(minNumber+" "+maxNumber);
    }
}