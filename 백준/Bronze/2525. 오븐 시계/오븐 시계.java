import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int add = sc.nextInt();
        int time = (hour*60)+min+add;
        System.out.println((time/60)%24);
        System.out.println(time%60);
    }
}