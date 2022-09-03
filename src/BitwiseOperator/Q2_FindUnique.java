package BitwiseOperator;

public class Q2_FindUnique {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,4,3,2,1};
        System.out.println(findUnique(a));
    }

   static int findUnique(int[] a) {

        int unique = 0;

       for (int element : a) {
           unique = unique ^ element;    //  same as {1,-1,2,-2,3,-3,5} sum all the number then ans will be 0.
       }                                 // xor all the element the return unique value
       return unique;
   }
}
