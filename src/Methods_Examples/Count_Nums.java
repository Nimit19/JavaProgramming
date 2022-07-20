package Methods_Examples;

public class Count_Nums {
    public static void main(String[] args) {
        int a = 102121222;
        int count = 0;
        int n = 0;

        while(a != 0) {
            n = a % 10;
            if (n == 2){
                count++;
            }
            a = a / 10;
        }

        System.out.println(count);
    }
}
