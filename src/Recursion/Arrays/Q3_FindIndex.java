package Recursion.Arrays;

public class Q3_FindIndex {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,10,5,6,7,8,9,10};
        int target = 10;
        int index = 0;

        // Find first positions of an element in  array
        System.out.println(findIndex(a,target,index));
    }

    static int findIndex(int[] a, int target,int index){
        if(index == a.length){
            return -1;
        }

        if(target == a[index]){
            return index;
        }else{
            return findIndex(a,target,index + 1);
        }
    }
}
