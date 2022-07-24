package Recursion.Arrays;

import java.util.ArrayList;

public class Q5_03FindTheAllIndex {
    public static void main(String[] args) {
        int[] a = {10,5,3,4,10};
        int target = 10;
        int index = 0;
        ArrayList<Integer> list = findAllIndex(a, target,index);
        System.out.println(list);
    }

    static ArrayList<Integer> findAllIndex(int[] a, int target, int index) {

        ArrayList<Integer> l1 = new ArrayList<>();
        if (index == a.length) {
            return l1;
        }

        // this will contain answer for that function only
        if (target == a[index]) {
            l1.add(index);
        }

        ArrayList<Integer> ans =  findAllIndex(a, target, index + 1);

        l1.addAll(ans);
        return l1;

    }
}
