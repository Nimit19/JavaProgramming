package Recursion.Arrays;

import java.util.ArrayList;

public class Q5_02FindTheAllIndex {
    public static void main(String[] args) {
        int[] a = {10,5,3,4,10};
        int target = 10;
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(a, target, index,list));
    }

    static ArrayList<Integer>  findAllIndex(int[] a, int target, int index,ArrayList<Integer> l1) {
        if (index == a.length) {
            return l1;
        }

        if (target == a[index]) {
           l1.add(index);
        }
        return findAllIndex(a, target, index + 1,l1);
    }
}
