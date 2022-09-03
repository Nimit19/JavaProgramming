package Practice;

public class P5_BinaryToDecimal {
    public static void main(String[] args) {

        int a = 1010;
        int r;
        int dec = 0;
        int c = 1;

        while(a>0){
            r = a % 10;
            dec = dec + (r * c);
            c = c * 2;
            a = a / 10;
        }
        System.out.println(dec);
    }
}
