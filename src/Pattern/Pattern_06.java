package Pattern;

import java.util.Scanner;

public class Pattern_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();
        pattern1(n);
    }

    static void pattern1(int n){
        System.out.println("\nPattern 1 : ");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i ; k++) {
                System.out.print("  "); // Important Double Space
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
