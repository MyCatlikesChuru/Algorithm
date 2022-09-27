import java.util.Arrays;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String[] strs = sc.nextLine().split(" ");
         System.out.println(Arrays.stream(strs).filter(s->!s.equals("")).count());
     }
}