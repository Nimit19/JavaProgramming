package Recursion.Question;

public class Q2_DigitSum {
    public static void main(String[] args) {

        int n = 197;
        System.out.println(degitSum(n));
        System.out.println(degitProduct(n));

        // without recursion
        int a = 125;
        int r;
        int sum = 0;
        while(a>0){
            r = a % 10;
            sum = sum + r;
            a = a / 10;
        }
        System.out.println(sum);


    }

    static int degitSum(int n) {
        if(n == 0){
            return 0;
        }
        return (n%10) + degitSum(n/10);
    }
   static int degitProduct(int n) {
       if((n%10) == n){
           return n;
       }
       return (n%10) * degitProduct(n/10);
    }

}
