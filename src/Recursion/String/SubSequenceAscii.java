package Recursion.String;

import java.util.ArrayList;

public class SubSequenceAscii {
    public static void main(String[] args) {
        System.out.println("Ascii value of a : " + ('a' + 0));
        System.out.println("Ascii value of b : " + ('a' + 1));
        System.out.println("Ascii value of c : " + ('a' + 2));
        System.out.println(SubSequenceAscii("","abc"));
    }

    static ArrayList<String> SubSequenceAscii(String s1, String s2){
        if (s2.equals("")) {
            ArrayList<String> l1 = new ArrayList<>();
            l1.add(s1);
            return l1;
        }
        char ch = s2.charAt(0);


        ArrayList<String> first = SubSequenceAscii(s1 + (ch + 0), s2.substring(1));
        ArrayList<String> second = SubSequenceAscii(s1, s2.substring(1));

        first.addAll(second);
        return first;
    }
}
