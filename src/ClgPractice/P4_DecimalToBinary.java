package ClgPractice;

public class P4_DecimalToBinary{
    public static void main(String[] args) {

        int a = 11;
        int num = 1;
        int r;
        while (a>0){
            r = a % 2;
            num = (num * 10) + r;
            a = a /2;
        }
        System.out.println(num);

        // Reverse a Number
        int b = num;
        int bin = 0;
        int c;

        while(b > 0){
            c = b % 10;
            bin = (bin*10) + c;
            b = b / 10;
        }
        // devide by 10
        bin = bin/10;

        System.out.println(bin);
    }
}
