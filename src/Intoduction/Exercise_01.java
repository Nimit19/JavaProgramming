package com.company;
import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your Physic marks : ");
            float Physic = sc.nextFloat();

            System.out.print("Enter your Chemistry marks : ");
            float Chemistry = sc.nextFloat();

            System.out.print("Enter your Maths marks : ");
            float Maths = sc.nextFloat();

            System.out.print("Enter your English marks : ");
            float English = sc.nextFloat();

            System.out.print("enter your Computer marks : ");
            float Computer = sc.nextFloat();

            float Percentage = ((Physic+Chemistry+Maths+English+Computer)*100)/500;
            System.out.println("Percentage : "+Percentage);

    }

}
