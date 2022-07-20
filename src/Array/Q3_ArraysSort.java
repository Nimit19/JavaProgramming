package Array;

public class Q3_ArraysSort {
    public static void main(String[] args) {

        int [] a = {90,94,92,93,91};

        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j=i+1;j<a.length;j++){
              if (a[i]>=a[j]) {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
            }
        }
        System.out.print("sorting element of array : ");
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
