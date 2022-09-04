package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q5_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details of Matrix 1: ");
        System.out.print("Enter Row: ");
        int r1 = sc.nextInt();
        System.out.print("Enter Col: ");
        int c1 = sc.nextInt();
        int[][] m1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("Enter the element of m2["+i+"]["+j+"]: ");
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Enter the Details of Matrix 2: ");
        System.out.print("Enter Row: ");
        int r2 = sc.nextInt();
        System.out.print("Enter Col: ");
        int c2 = sc.nextInt();
        int[][] m2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("Enter the element of m2["+i+"]["+j+"]: ");
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matrix 1: ");
        for (int i = 0; i < r1; i++) {
            System.out.println(Arrays.toString(m1[i]));
        }

        System.out.println();
        System.out.println("Matrix 2: ");
        for (int i = 0; i < r2; i++) {
            System.out.println(Arrays.toString(m2[i]));
        }
        System.out.println();

        int[][] ans = matrixMultiplication(m1, m2);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    static int[][] matrixMultiplication(int[][] m1, int[][] m2) {

        int[][] ans = new int[m1.length][m2[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                ans[i][j] = 0;
                for (int k = 0; k < m2.length; k++) {
                    ans[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return ans;
    }

}
