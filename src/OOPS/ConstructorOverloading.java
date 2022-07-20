package com.company;
class Student3{
    private int No;
    private String Name;

    public Student3(){
        No = 1;
        Name = "Nimit Patel";
    }
    public Student3(String name){
        No = 2;
        Name = name;
    }
    public Student3(String name,int no){
        No = no;
        Name = name;
    }
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

public class ConstructorOverloading {
    public static void main(String[] args) {

        Student3 obj1 = new Student3();
        Student3 obj2 = new Student3("Nik Patel");
        Student3 obj3 = new Student3("Yug Patel",3);
        System.out.print("\n");

        System.out.println("No : " + obj1.getNo());
        System.out.println("Name : " + obj1.getName());
        System.out.print("\n");

        System.out.println("No : " +obj2.getNo());
        System.out.println("Name : " + obj2.getName());
        System.out.print("\n");

        System.out.println("No : " +obj3.getNo());
        System.out.println("Name : " + obj3.getName());
    }
}
