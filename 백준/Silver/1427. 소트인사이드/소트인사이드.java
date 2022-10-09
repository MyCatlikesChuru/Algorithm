import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split("");
        String result = "";
        Arrays.sort(numbers, Collections.reverseOrder());
        for(int i=0; i<numbers.length; i++){
            result += numbers[i];
        }
        System.out.println(result);
    }
}