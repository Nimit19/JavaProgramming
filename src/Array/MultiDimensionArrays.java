package Array;
import java.util.Scanner;

public class MultiDimensionArrays{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][] a= new int [2][3];

        for (int i=0; i<2 ; i++){
            for (int j=0; j<3 ; j++){
                System.out.print("Enter the a["+i+"]["+j+"] Element : " );
                a[i][j] = sc.nextInt();
            }
        }

//        System.out.println("Matrix : ");
//        for (int i=0; i<2 ; i++){
//            System.out.print(" \t ");
//            for (int j=0; j<3 ; j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.print("\n");

        System.out.println("Matrix : ");
        for (int i=0; i<a.length; i++){
            System.out.print(" \t ");
            for (int j=0; j<a[i].length ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");

        }

    }
}
