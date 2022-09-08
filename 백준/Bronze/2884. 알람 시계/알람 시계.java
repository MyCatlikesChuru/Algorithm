import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        if(hour==0 && min<45) hour = 24;
        int time = (hour*60)+min-45;
        
        System.out.println(time/60);
        System.out.println(time%60);
    }
}