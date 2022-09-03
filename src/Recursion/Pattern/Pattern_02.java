package Recursion.Pattern;

public class Pattern_02 {
    public static void main(String[] args) {
        pattern1(5,0);
        pattern2(5,0);
    }

    // 1]
    static void pattern1(int row, int col) {
        if(row == 0)
            return;

        if(row > col){
            System.out.print("* ");
            pattern1(row ,col + 1);
        }
        else {
            System.out.println();
            pattern1(row - 1,0);
        }
    }

    // 2]
    static void pattern2(int row, int col) {
        if(row == 0)
            return;

        if(row > col){
            pattern2(row ,col + 1);
            System.out.print("* ");
        }
        else {
            pattern2(row - 1,0);
            System.out.println();
        }
    }
}
