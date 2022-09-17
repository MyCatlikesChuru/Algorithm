import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*   제목 : 소수 찾기
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        boolean isPrime = false;
        String[] strs = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            // br.readLine으로 입력값 받아오는 구문
            int primeNumber = Integer.parseInt(strs[i]);

            // 2는 소수이므로 +1;
            // 2로 나누어 떨어지는 값은 소수가 아니므로 다음구문으로
            if(primeNumber==2) {
                result += 1;
                continue;
            } else if(primeNumber%2==0 || primeNumber==1){
                continue;
            }

            // 2,3,5,7 의 배수들은 제외한 수가 소수이다.
            // 2,3,5,7 제곱근은 3보다 작기때문에 for문을 통과한다.
            for(int j=3; j<=Math.sqrt(primeNumber); j+=1){
                if(primeNumber%j==0) isPrime = true; // 2~제곱근까지 나누어떻어지면 소수가 아니다.
            }
            if(!isPrime) {
                result += 1;
            }
            isPrime = false;
        }
        System.out.println(result);
    }
}