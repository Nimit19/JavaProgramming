package Methods_Examples;

public class Fibonacci2 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Fib(i));
//        }
        int count = 0;
        int range = 35;
        int i;

        while(true){
            i = Fib(count);
            if (i <= range){
                System.out.println(i);
            }
            else{
                break;
            }
            count++;
        }
    }
    static int Fib(int n){
        int a = 0;
        int b = 1;

        if(n == a)
            return a;
        else if(n == b)
            return b;

        int count = 2;

        while(count <= n){
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
        return b;
    }
}
