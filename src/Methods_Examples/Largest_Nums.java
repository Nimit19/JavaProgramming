package Methods_Examples;
import java.util.Scanner;

public class Largest_Nums {
    public static void main(String[] args) {

        System.out.print("Enter three numbers : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
/*
        // 1]
        if(a>b){

            if (a>c) {
                System.out.println(a);
            } else{
                System.out.println(c);
            }

        } else {

            if (b>c) {
                System.out.println(b);
            } else{
                System.out.println(c);
            }
        }

        // 2]
        int max = 0;
        if (a>b){
            max = a;
        }else {
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println(max);

        // 3]
        int max = a;

        if(b>max){
            max = b;
        }

        if (c>max) {
            max = c;
        }
        System.out.println(max);
*/

        // 4]
        System.out.println(Math.max(c,Math.max(a,b)));
    }
}
