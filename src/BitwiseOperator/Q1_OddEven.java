package BitwiseOperator;

public class Q1_OddEven {
    public static void main(String[] args) {
        int n = 38;
        System.out.println(isEven(n));
        System.out.println(isOdd(n));
    }

    static boolean isEven(int n){
        return (n & 1) == 0;
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
