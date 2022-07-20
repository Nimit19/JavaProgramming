package Array;

import java.util.Arrays;

public class Array_01 {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        int[] b = new int[5];
        b[0]=1;
        b[1]=3;
        b[3]=5;

        int[] c;
        c = new int[5];

        String[] s = new String[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int j : a) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(s));
    }
}
