import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet,-1);
        for(int i=0; i<str.length(); i++){
           int position = str.charAt(i)-'a';
           if(alphabet[position]==-1) alphabet[position] = i;
        }

        for(int j=0; j<alphabet.length; j++){
            result += alphabet[j];
            if(j!=alphabet.length)result += " ";
        }
        System.out.println(result);
    }
}