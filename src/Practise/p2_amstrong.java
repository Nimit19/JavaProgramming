package Practise;

public class p2_amstrong {
    public static void main(String[] args) {

        int a = 153;
        int b = 0;
        int c;
        int orignal = a;

        while (a >0){
            c = a % 10;
            b = b + (c*c*c);
            a = a/10;
        }

        if (orignal == b){
            System.out.println("Amstrong");
        }
        else{
            System.out.println("NOt a Amstrong");
        }
    }
}
