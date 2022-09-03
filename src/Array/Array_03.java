package Array;

import java.util.Arrays;

public class Array_03 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));
    }
    static void change(int a[]){
        a[0]= 100;
        a[4] = 38;
    }
}
