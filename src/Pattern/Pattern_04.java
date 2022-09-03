package Pattern;

import java.util.Scanner;

public class Pattern_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();
        pattern1(n);
        pattern2(n);
    }

//    static void pattern1(int n){
//        System.out.println("\nPattern 1 : ");
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j < n-i+1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    static void pattern1(int n){
        System.out.println("\nPattern 1 : ");
        for (int i = 1; i <= 2*n - 1; i++) {
            int col = i > n ? 2*n - i : i; // Important
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){

    }
}
