package Pattern;

import java.util.Scanner;

public class Pattern_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
    }

    static void pattern1(int n) {
        System.out.println("\nPattern 1 : ");

        for (int i = 1; i <= 2*n - 1; i++) {
            for (int j = 1; j <= 2*n - 1; j++) {
                int index = Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j)) ;
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        System.out.println("\nPattern 2 : ");

        for (int i = 1; i <= 2*n - 1; i++) {
            for (int j = 1; j <= 2*n - 1; j++) {
                int index = ( n - Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j)) ) + 1;
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        System.out.println("\nPattern 3 : ");

        for (int i = 1; i <= 2*n - 1; i++) {
            for (int j = 1; j <= 2*n - 1; j++) {
                int index = Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j)) - 1 ;
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        System.out.println("\nPattern 4 : ");

        for (int i = 1; i <= 2*n - 1; i++) {
            for (int j = 1; j <= 2*n - 1; j++) {
                int index = n - Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j))  ;
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}
