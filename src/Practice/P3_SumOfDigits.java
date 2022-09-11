package Practice;

public class P3_SumOfDigits {
    public static void main(String[] args) {

        int a = 125;
        int r;
        int sum = 0;
        while(a>0){
            r = a % 10;
            sum = sum + r;
            a = a / 10;
        }

        System.out.println(sum);
        System.out.println(sumOfDigits(285));
    }

    static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }
}
