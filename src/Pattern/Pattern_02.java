package Pattern;

import java.util.Scanner;

public class Pattern_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
    }
    static void pattern1(int n){
        System.out.println("\nPattern 1 : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    static void pattern2(int n){
        System.out.println("\nPattern 2 : ");
        char c = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        System.out.println("\nPattern 3 : ");
        char c = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");

            }
            c++;
            System.out.println();
        }
    }
    static void pattern4(int n){
        System.out.println("\nPattern 4 : ");

        for (int i = 1; i <= n; i++) {
            char c = 'a';
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
