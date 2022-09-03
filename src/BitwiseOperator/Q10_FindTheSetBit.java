package BitwiseOperator;

public class Q10_FindTheSetBit {
    public static void main(String[] args) {

        int n = 217; // 1010
        System.out.println(Integer.toBinaryString(n));

        int count = 0;

        // 1]
        while(n > 0 ){
            if ((n & 1) == 1){
                count = count + 1;
            }
            n = n >> 1;
        }

//        // 2]
//        while (n>0){
//            n =  n  - (n & -n);
//            count = count + 1;
//        }

//        // 3]
//        while (n>0){
//            n =  n & (n - 1);
//            count = count + 1;
//        }

        System.out.println(count);
    }
}
