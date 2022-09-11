package Recursion.Question;

public class Q5_CountZero{
    public static void main(String[] args) {
        int n = 10056050;
        System.out.println(countZero(n));
    }

    static int countZero(int n){
        return helper(n,0);
    }

    static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10,count + 1);
        }
        return helper(n/10, count);
    }

}
