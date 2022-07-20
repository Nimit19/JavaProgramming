package Methods_Examples;

public class Reverse_Nums {
    public static void main(String[] args) {

        int a = 325_541;
        int n = 0;
        int Num = 0;

        while(a != 0) {
            n = a % 10;
            Num = (Num * 10)+ n;
            a = a / 10;
        }
        System.out.println(Num);
    }
}
