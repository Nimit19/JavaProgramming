package Recursion.Arrays;

public class Q2_IsElementPresent {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        int index = 0;
        System.out.println(isPresent(a,target,index));
        System.out.println(isPresent2(a,target,index));
    }

    static boolean isPresent(int[] a, int target,int index){
        if(index == a.length){
            return false;
        }

        if(target == a[index]){
            return true;
        }

        return isPresent(a,target,index + 1);
    }

    static boolean isPresent2(int[] a, int target,int index){
        if(index == a.length){
            return false;
        }

        return target == a[index] || isPresent2(a,target,index + 1);
    }


}
