import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int fst;
        int sec;

        for(int i=0;i<testcase;i++){
            fst = sc.nextInt();
            sec = sc.nextInt();
            System.out.println(fst+sec);
        }
    }
}