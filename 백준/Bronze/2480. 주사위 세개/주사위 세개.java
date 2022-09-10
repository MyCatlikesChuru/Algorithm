import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int[] number = {one,two,three};
        int result = 0;
        int cnt = 0;
        if(one==two) {
            result=one;
            cnt++;
        }
        if(one==three) {
            result=one;
            cnt++;
        }
        if(two==three){
            result=two;
            cnt++;      
        }

        if(cnt==0){
            int maxNumber = Arrays.stream(number)
                                .max()
                                .getAsInt();
            System.out.println(100*maxNumber);

        } else if (cnt==1) {
            System.out.println(1000+(result*100));
        } else {
            System.out.println(10000+(result*1000));
        }
    }
}