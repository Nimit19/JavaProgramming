package Array;

public class Q2_Reverse_Array2 {
    public static void main(String[] args) {

        int [] a = {91,92,93,94,95};
        int temp;
        for (int i = 0; i < a.length/2; i++) {
            temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }

        System.out.print("Reverse element of array : ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
