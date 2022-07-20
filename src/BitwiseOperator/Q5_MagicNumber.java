package BitwiseOperator;
/*
n = 5
           5^4+ 5^3+ 5^2+ 5^1
1 = 0001 = 0  + 0  + 0  + 5 = 5
2 = 0010 = 0  + 0  + 25 + 0 = 25
3 = 0011 = 0  + 0  + 25 + 5 = 30
4 = 0100 = 0  +125 + 0  + 0 = 125
5 = 0101 = 0 + 125 + 0 +5 = 130
6 = 0110 = 0 + 125 + 25 + 0 = 150
 */
public class Q5_MagicNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(magicNumber(n));
    }

    private static int magicNumber(int n) {
        int result = 0;
        int base = 5;

        while (n > 0){
            int lastBit = n & 1;
            n = n >> 1;

            result = result + (lastBit * base);
            base = base * 5;
        }
        return result;
    }
}
