package BitwiseOperator;

public class Q9_BaseToThePower {
    public static void main(String[] args) {
        int base = 2;
        int power = 10; // 1010

        System.out.println(baseToThePower1(base,power));
        System.out.println(baseToThePower2(base,power));

    }

    static int baseToThePower2(int base, int power) {
        int ans = 1;
        while(power > 0 ){
            if ((power & 1 )== 1){
                ans = ans * base;
            }
            base = base * base;
            power = power >> 1;
        }
        return ans;
    }

    static int baseToThePower1(int base, int power) {
        int ans = 1;
        for (int i = 1; i <= power; i++) {
            ans = ans * base;
        }
        return ans;
    }


}
