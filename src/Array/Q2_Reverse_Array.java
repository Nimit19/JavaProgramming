package Array;

import java.util.Arrays;

public class Q2_Reverse_Array {
    public static void main(String[] args) {
        int[] a = {1,20,38,46,50,197};

        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));

    }

    static void reverse(int[] a){
        int start = 0;
        int end = a.length - 1;
        while(start<end){
            swap(a,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] a,int index1,int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
