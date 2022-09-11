package Recursion.Introduction;

public class Recursion_01 {
    public static void main(String[] args) {
        printNum(0);
        System.out.println();

        printReverseNum(0);
        System.out.println();

        printBoth(0);
    }

    static void printNum(int n){
        if(n == 5){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printNum(n + 1);
    }

    static void printReverseNum(int n){
        if(n == 5){
            System.out.print(n + " ");
            return;
        }
        printReverseNum(n + 1);
        System.out.print(n + " ");
    }

    static void printBoth(int n){
        if(n == 5){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printBoth(n + 1);
        System.out.print(n + " ");

    }
}
