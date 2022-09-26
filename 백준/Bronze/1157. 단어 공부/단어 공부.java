import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strs = br.readLine().toUpperCase();
        int[] arr = new int[26];
        int max = -1;
        char result = '?';

        for (int i = 0; i < strs.length(); i++){
            if ('A' <= strs.charAt(i) && strs.charAt(i) <= 'Z') {
                arr[strs.charAt(i) - 'A']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char) (i + 'A');
            }
            else if (arr[i] == max) {
                result = '?';
            }
        }
        System.out.print(result);
    }
}