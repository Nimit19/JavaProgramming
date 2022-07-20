package ClgPractice;

public class p1_Reverse_Nums {
    public static void main(String[] args) {

        int a = 1534236469;
        int rev = 0;

        while(a != 0){
            rev = (rev * 10) + a % 10;
            a = a / 10;
        }
        System.out.println(rev);
    }
}
