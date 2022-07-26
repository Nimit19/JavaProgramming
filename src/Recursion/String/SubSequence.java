package Recursion.String;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        // 1]
        subSequence1("","abc");

        // 2]
        System.out.println(subSequence2("","abc"));

        // 3]
        subSequence3("","abc");
        System.out.println(l2);

        // 4]
        System.out.println(subSequence4("","abc",new ArrayList<String>()));

    }

    // 1]
    static void subSequence1(String s1,String s2) {
        if (s2 == "") {
            System.out.println(s1);
            return;
        }
        char ch = s2.charAt(0);
        subSequence1(s1 + ch, s2.substring(1));
        subSequence1(s1, s2.substring(1));
    }


    // 2]
    static ArrayList<String> subSequence2(String s1,String s2){
        if (s2.equals("")) {
            ArrayList<String> l1 = new ArrayList<>();
            l1.add(s1);
            return l1;
        }
        char ch = s2.charAt(0);

        ArrayList<String> first = subSequence2(s1 + ch, s2.substring(1));
        ArrayList<String> second = subSequence2(s1, s2.substring(1));

        first.addAll(second);
        return first;
    }

    // 3]
    static  ArrayList<String> l2 = new ArrayList<>();
    static void subSequence3(String s1,String s2) {
        if (s2.isEmpty()) {
            l2.add(s1);
            return;
        }
        char ch = s2.charAt(0);
        subSequence3(s1 + ch, s2.substring(1));
        subSequence3(s1, s2.substring(1));
    }

    // 4]
    static ArrayList<String> subSequence4(String s1,String s2,ArrayList<String> l3) {
        if (s2.isEmpty()) {
            l3.add(s1);
            return l3;
        }
        char ch = s2.charAt(0);

        ArrayList<String> first = subSequence2(s1 + ch, s2.substring(1));
        ArrayList<String> second = subSequence2(s1, s2.substring(1));

        first.addAll(second);
        return first;

    }
}
