package Recursion.Arrays;

public class Q1_IsSortedArray {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9,10};
        int start = 0;

        // work for Ascending Order
        System.out.println(isSorted(a,start));

        System.out.println(isSortedOrNot(a));
    }



    static boolean isSortedOrNot(int [] a){
        int start = 0;
        return helper(a,start);
    }

    private static boolean helper(int[] a, int start) {
//        if(start == a.length - 1){
//            return true;
//        }
//
//        if(a[start] < a[start + 1]){
//            return false;
//        }
//
//        return helper(a,start + 1 );

        if(start == a.length - 1){
            return true;
        }

        return a[start] < a[start + 1] && helper(a,start + 1 );

    }

    //1]
//    static boolean isSorted(int[] a, int start) {
//        if(start == a.length - 1)
//            return true;
//
//        if(a[start] > a[start + 1])
//            return false;
//
//        return isSorted(a,start + 1);
//    }

    // 2]
    static boolean isSorted(int[] a, int start) {
        if(start == a.length - 1)
            return true;

        return a[start] < a[start + 1] && isSorted(a,start + 1);
    }
}
