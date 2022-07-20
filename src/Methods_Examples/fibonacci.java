package Methods_Examples;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 2;
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series : 0 1 ");
        while(count < n) {
            int temp = a + b;
            a = b;
            b = temp;
            count++;
            System.out.print(b + " ");
        }
    }
}
