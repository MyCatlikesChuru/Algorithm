import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main example = new Main();
        System.out.println(example.fibonacci(Integer.parseInt(sc.nextLine())));;
    }
    public int fibonacci(int x){
        if(x<2) return x;
        if(x<=2) return 1;
        return fibonacci(x-1)+fibonacci(x-2);
    }
}