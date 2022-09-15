package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer> >l1 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            l1.add(new ArrayList<>());
        }

        int val;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the Value : ");
                val = sc.nextInt();
                l1.get(i).add(val);
            }
        }

        System.out.println(l1);
    }
}
