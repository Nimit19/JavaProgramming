package BitwiseOperator;

public class Q4_FindUnique {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,4,3,2,1,1,2,3,4};  // all element appear 3 time except 5
        System.out.println(findUnique(a,a.length));
    }

    private static int findUnique(int[] a,int n) {

        int result = 0;
        int x,sum;

        for (int i = 0; i < 8; i++) {  // we assume the all the element is 8 bits number

            sum = 0;
            x = (1 << i);

            for (int j = 0; j < n; j++) {
                if ((a[j] & x) != 0){
                    sum++;
                }
            }

            if((sum % 3) != 0){
                result = result | x;
            }
        }

        return  result;

    }
}
