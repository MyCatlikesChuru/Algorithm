import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer [] arr = new Integer[9];
        for(int i=0;i<9;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int maxNumber = Arrays.stream(arr).mapToInt(s->s).max().getAsInt();
        List<Integer> abc = new ArrayList<>(Arrays.asList(arr));
        System.out.println(maxNumber);
        System.out.println(abc.indexOf(maxNumber)+1);
    }
}