package com.company;
import java.util.Scanner;

class Student1{
    private int No;
    private String Name;

    public void setName(String name) {
        Name = name;
    }

    public String getName(){
        return Name;
    }

    public void setNo(int no){
        No = no;
    }

    public int getNo(){
        return No;
    }
}
public class GetterAndSetter {
    public static void main(String[] args) {

        Student1 nimit  = new Student1();
        Student1 yug = new Student1();

//        nimit.Name = "Nimit"; --> Throws an error due to privet access modifier
//        nimit.No = 1 ;

        nimit.setName("Nimit Patel");
        nimit.setNo(1);
        System.out.println("Student Name : " + nimit.getName());
        System.out.println("Student No : " + nimit.getNo());
        System.out.print("\n");

        yug.setName("Yug Patel");
        yug.setNo(2);
        System.out.println("Student Name : " + yug.getName());
        System.out.println("Student No : " + yug.getNo());
        System.out.print("\n");


        Student1 name1  = new Student1();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        name1.setName(name);
        System.out.print("Enter your no : ");
        int no = sc.nextInt();
        name1.setNo(no);
        System.out.println("Student Name : " + name1.getName());
        System.out.println("Student No : " + name1.getNo());
        System.out.print("\n");


    }





}
