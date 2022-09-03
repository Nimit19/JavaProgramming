package Recursion.Permutations;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {

//        permutation("abc", "");
        System.out.println(permutationList("abc",""));
    }

    static void permutation(String up, String p) {
        if (up.equals("")) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(up.substring(1), f + ch + s);
        }
    }

    static ArrayList<String> permutationList(String up,String p){
        if (up.equals("")) {
            ArrayList<String> l1 = new ArrayList<>();
            l1.add(p);
            return l1;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationList(up.substring(1),f + ch + s));

        }
        return ans;
    }

}

/*

                       "",abc
                        |                              -----> 1  p.length + 1
                       a, bc

              /                    \                   -----> 2
             ba, c                  ab, c
        /     |     \           /     |     \          -----> 3
      cba,"" bca,"" bac,""  cab,"" acb,"" abc,""

*/