package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIst_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> l1 = new ArrayList<>(4);

        System.out.print("Enter the Value of n : ");
        int n = sc.nextInt();

        int val;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Value : ");
            val = sc.nextInt();
            l1.add(val);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(l1.get(i) + " ");
        }
    }
}
