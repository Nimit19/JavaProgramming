package BitwiseOperator;

/*
find the xor of number from 0 to a.
0 = 0                                   a
1 = 0^1 = 1                             1
2 = 0^1^10 = 11 = 3                     a + 1
3 = 0^1^10^11 = 0                       0
4 = 0^1^10^11^100 = 100 = 4             a
5 = 0^1^10^11^100^101 = 001 = 1         1
6 = 0^1^10^11^100^101^110 = 111 = 7     a + 1
7 = 0^1^10^11^100^101^110^111  = 0      0
 */

public class Q11_RangeXOR {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(xorNumber(n));

        // it's not work for large data
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans = ans^i;
        }
        System.out.println(ans);

        // xor in range
        int a = 3;
        int b = 9;

        int ans2 = xorNumber(b) ^ xorNumber(a - 1);
        System.out.println(ans2);
    }

    static int xorNumber(int n) {

        if(n%4 == 0)
            return n;

        if(n%4 == 1)
            return 1;

        if(n%4 == 2)
            return n + 1;

        return 0;
    }
}
