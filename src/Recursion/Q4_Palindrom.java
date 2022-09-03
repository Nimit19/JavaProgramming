package Recursion;

public class Q4_Palindrom {
    public static void main(String[] args) {
        int n = 1234554321;
        System.out.println(isPalin1(n));
        System.out.println(isPalin2(n));
    }

    static boolean isPalin1(int n) {
        if(n == reverse(n)){
            return true;
        }
        return false;
    }

    // not wro for large number
    static boolean isPalin2(int n) {
        int orignal = n;
        int rem;
        int ans = 0;
//        int digits = (int) (Math.log10(n) + 1 );
       while (n > 0){
           rem = n % 10;
           ans = (ans + rem ) * 10;
//           digits--;
           n = n/10;
       }
       ans = ans/10;
       return ans == orignal;
    }


    static int reverse(int n) {
        int digits = (int) (Math.log10(n) + 1 );
        return helper(n,digits);
    }

    static int helper(int n,int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10,digits - 1) + helper(n/10,digits - 1);
    }
}
