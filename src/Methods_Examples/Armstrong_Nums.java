package Methods_Examples;

public class Armstrong_Nums {
    public static void main(String[] args) {

        for (int i = 0; i < 999; i++) {
            if(Armstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean Armstrong(int a){
        int original = a;
        int sum = 0;
        int rem = 0;

        while(a!=0){
            rem = a % 10;
            sum = sum + (rem * rem * rem);
            a = a/10;
        }

//        if(sum == original)
//            return true;
//        else
//            return false;

        return sum == original;
    }
}
