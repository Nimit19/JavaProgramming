package Array;
import java.util.Scanner;

public class Q4_MatrixSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] a = { { 1, 2, 3 },
                      { 4, 5, 6 } };

        int[][] b = { { 6, 5, 4 },
                     { 3, 2, 1 } };

        int[][] sum = { { 0, 0, 0 },
                       { 0, 0, 0 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();

        }

    }

}
