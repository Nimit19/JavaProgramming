package BitwiseOperator;

public class Q6_NumberOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int base = 2;  // 2 for binary,10 for decimal,8 for octal,16 for hexadecimal

        int ans = (int) (Math.log(n)/Math.log(base)) + 1;
        System.out.println(ans);

    }
}

