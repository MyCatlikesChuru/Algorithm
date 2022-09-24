import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int change = (int) input.charAt(0);
        System.out.println(change);
    }
}