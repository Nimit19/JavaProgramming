package BitwiseOperator;
/*
pascal triangle
row 0         1         : 1
row 1        1 1        : 2
row 2       1 2 1       : 4
row 3      1 3 3 1      : 8
row 4     1 4 6 4 1     : 16
row 5   1 5 10 10 5 1   : 32
row 6  ..............

Q1: Find the sum of the nth row.

solution :
nC1+nC2+nC3+.....+nCn = 2^n
if n = 3
= 3c0 +3c1 +3c2 +nc3
= 1 + 3 +  3 + 1
= 8

Q2 : sum of all element up to nth row in a pascal triangle.
 */

public class Q7_PascalsTriangle {
    public static void main(String[] args) {

        int n = 5;
        System.out.println(sumOfNthRow(n));
        System.out.println(sumOfNthRowAllElement(n));
    }

    static int sumOfNthRowAllElement(int n) {
        int sum = 0;
        int a;
        for (int i = 0; i <= n; i++) {
//            a = sumOfNthRow(i);
            a = 1 << i;
            sum = sum + a;
        }
        return sum;
    }

  static int sumOfNthRow(int n) {
        return 1 << n;
        // n = 0 : 1 = 2^0
        // n = 1 : 10 = 2^1
        // n = 2 : 100 = 2^2
        // n = 3 : 1000 = 2^3
    }
}
