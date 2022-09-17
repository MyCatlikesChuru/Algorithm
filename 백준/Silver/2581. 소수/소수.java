
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine()); // M 이상
        int N = Integer.parseInt(br.readLine()); // N 이하
        int sum = 0;
        int min = 0;
        boolean isNotPrime = false;
        boolean minSave = false;
        for(int i=M;i<=N;i++){

            if(i==2){
                sum += 2;
                min = 2;
                minSave = true;
                continue;
            }else if(i==1 || i%2==0){
                continue;
            }

            for(int j=3;j<=Math.sqrt(i);j++){
                if(i%j==0) isNotPrime = true;
            }
            if(!isNotPrime){
                sum+=i;
                if(!minSave){
                    min=i;
                    minSave = true;
                }
            }
            isNotPrime = false;
        }
        if(sum==0&&min==0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
