package Methods;
import java.util.Scanner;

public class PatternByRecursion {

    static void pattern1(int n){
        if(n>0){
            pattern1(n-1);
            for (int i=1;i<=n;i++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void pattern2(int n){
        if(n>0){
            for (int i=1; i<=n; i++){
                System.out.print("* ");
            }
            System.out.print("\n");
            pattern2(n-1);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row : ");
        int n = sc.nextInt();

        System.out.println("Pattern 1 : ");
        pattern1(n);
        System.out.print("\n");

        System.out.println("Pattern 2 : ");
        pattern2(n);


    }
}
