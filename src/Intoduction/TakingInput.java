package com.company;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args){

        System.out.println("----Taking inputs from user----");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n1(int) : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the n2(int) : ");
        int n2 = sc.nextInt();
        int sum1 = n1+n2;
        System.out.print("The sum is : ");
        System.out.println(sum1);

        System.out.print("Enter the n3(float) : ");
        float n3 = sc.nextFloat();
        System.out.print("Enter the n4(float) : ");
        float n4 = sc.nextFloat();
        float sum2= n3+n4;
        System.out.print("The sum is : ");
        System.out.println(sum2);

    }
}
