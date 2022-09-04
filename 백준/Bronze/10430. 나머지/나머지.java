import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a < 2 || a > 10000){
            a = sc.nextInt();
        }
        
        int b = sc.nextInt();
        while(b < 2 || b > 10000){
            b = sc.nextInt();
        }
        
        int c = sc.nextInt();
        while(c < 2 || c > 10000){
            c = sc.nextInt();
        }
        sc.close();

        System.out.println((a+b)%c);
        System.out.println((a%c + b%c)%c);
        System.out.println((a*b)%c);
        System.out.println((a%c * b%c)%c);
    }
}
