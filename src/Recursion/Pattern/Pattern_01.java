package Recursion.Pattern;

public class Pattern_01 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        if(n == 0){
            return;
        }

        pattern(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }
}
