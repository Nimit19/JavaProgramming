package Methods;
import java.util.Scanner;

public class FibonacciSeries {
    static int fib(int n){
//         if(n==1){
//             return 0;
//         }
//         else if (n==2){
//             return 1;
//         }
//         else{
//             return fib(n-1) + fib(n-2);
//         }

        if(n==1 || n==2){
            return n-1;
        }
          else{
            return fib(n-1)+fib(n-2);
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.print("Fibonacci series : ");
        for (int i=1 ;i<=n;i++){
            System.out.print(fib(i) + " ");
        }

    }
}
