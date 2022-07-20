package Intoduction;
import java.util.Scanner;

public class TakingStringInput {
    public static void main(String[] args){

        System.out.println("-----Taking inputs from user-----");

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the name : ");
//      String str1 = sc.next();
        String str1 = sc.nextLine();
        System.out.println(str1);

    }
}
