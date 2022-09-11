import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int buyPrice = Integer.parseInt(br.readLine());
        int buyQty = Integer.parseInt(br.readLine());
        int productQty;
        int productPrice;
        int result = 0;
        for(int i=0; i<buyQty; i++){
            String[] strs = br.readLine().split(" ");
            productPrice = Integer.parseInt(strs[0]);
            productQty = Integer.parseInt(strs[1]);
            result += productPrice*productQty;
        }
        if(result==buyPrice) System.out.println("Yes");
        else System.out.println("No");
    }
}