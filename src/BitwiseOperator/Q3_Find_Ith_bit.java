package BitwiseOperator;

public class Q3_Find_Ith_bit {
    public static void main(String[] args) {
        int n = 10; // 1010
        int i = 4;
        System.out.println(ithBit(n,i));
        System.out.println(setBit(n,i));
        System.out.println(toggleBit(n,i));

    }

    static int ithBit(int n ,int i ){
        return 1 & (n >> (i - 1));
    }

    static int setBit(int n, int i){
        return n | (1 << (i - 1));
    }

    static int toggleBit(int n, int i){  // toggle means if bit is 0 then change it to 1 visa versa
        return (n ^ (1 << (i - 1)));
    }
}
