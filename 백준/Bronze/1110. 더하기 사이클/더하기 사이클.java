import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.length()==1) str = "0"+str;
        String[] strs = str.split("");
        String A = strs[0];
        String B = strs[1];
        int cnt = 1;

        while(true){
            int sum = Integer.parseInt(A)+Integer.parseInt(B);
            String stringSum = String.valueOf(sum);

            if(stringSum.length()==1)stringSum = "0"+stringSum;
            if(str.equals(B+stringSum.charAt(1))) break;
            A = String.valueOf(Integer.parseInt(B));
            B = String.valueOf(stringSum.charAt(1)-'0');
            cnt++;
        }
        System.out.println(cnt);
    }
}