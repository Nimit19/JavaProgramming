package BitwiseOperator;

public class Q8_PowerOfTwoOrNot {
    public static void main(String[] args) {
        int n = 0;
        // it's not work for zero so its return true for zero
        // fix in a function for zero
        System.out.println(isPowerOfTwo(n)); // work for zero

        // without function
        boolean ans = (n & (n - 1)) == 0; // not work for zero
        System.out.println(ans);
    }

    static boolean isPowerOfTwo(int n) {
        if (n == 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
    /*
        if n = 8 then
          1000
        & 0111
         -------
          0000  = 0

        if n = 7 then
          0111
        & 0110
         -------
          0110 != 0
     */
}
