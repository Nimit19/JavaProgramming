package Intoduction;

public class Mutability {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        int[] b = a;

        System.out.print("B : ");
        for (int i = 0; i <a.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.print("\n");

        a[0]=5;

        System.out.print("B : ");
        for (int i = 0; i <a.length; i++) {
            System.out.print(b[i] + " ");
        }


    }
}
