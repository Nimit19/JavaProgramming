package Recursion;

public class Q1_Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        System.out.println(sum(n));
    }

    static int fact(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        return n * fact(n -1);
    }

   static int sum(int n) {
        if (n == 0){
            return 0;
        }
        return n + sum(n -1);
    }
}
