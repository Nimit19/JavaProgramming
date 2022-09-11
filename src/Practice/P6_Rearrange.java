package Practice;

import java.util.Arrays;

public class P6_Rearrange {
    public static void main(String[] args) {
        int[] a ={4,0,2,1,3};
        int[] ans  = func(a);
        System.out.println(Arrays.toString(ans));
    }
    static int[] func(int[] a){
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = a[a[i]];
        }
        return ans;
    }
}
