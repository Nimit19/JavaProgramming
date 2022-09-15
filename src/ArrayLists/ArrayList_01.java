package ArrayLists;

import java.util.ArrayList;

public class ArrayList_01 {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>(4);

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);

        System.out.println(l1);

        l1.set(0,25);
        System.out.println(l1);

        l1.remove(0);
        System.out.println(l1);

        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));
        System.out.println(l1.get(3));
        System.out.println(l1.get(4));
    }
}
