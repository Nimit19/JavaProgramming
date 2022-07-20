package Array;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

        int[][] a = {
                {1,2,3,4}, // 0th index
                {5,6},     // 1st index
                {7,8,9}    // 2nd index --> a[2] = {7,8,9}
        };

//        System.out.println(Arrays.toString(a[1]));
//
//        // 1]
//        for (int row = 0; row < a.length; row++) {
//            for (int col = 0; col < a[row].length; col++) {
//                System.out.print(a[row][col] + " ");
//            }
//            System.out.println();
//        }

        // 2]
        for (int row = 0; row < a.length; row++) {
            System.out.println(Arrays.toString(a[row]));
        }

        // 3]
        for (int[] num : a) {
            System.out.println(Arrays.toString(num));
        }

//        // 4],
//        for (int[] row : a) {
//            for (int col : row) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }
//

    }

}
