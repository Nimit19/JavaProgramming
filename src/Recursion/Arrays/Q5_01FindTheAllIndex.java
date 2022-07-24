package Recursion.Arrays;

import java.util.ArrayList;

public class Q5_01FindTheAllIndex {
    public static void main(String[] args) {
        int[] a = {10,5,3,4,10};
        int target = 10;
        int index = 0;
        findAllIndex(a, target, index);
        System.out.println(l1);
    }

    static ArrayList<Integer> l1 = new ArrayList<>();

    static void findAllIndex(int[] a, int target, int index) {
        if (index == a.length) {
            return;
        }

        if (target == a[index]) {
            l1.add(index);
        }
        findAllIndex(a, target, index + 1);

    }
}
