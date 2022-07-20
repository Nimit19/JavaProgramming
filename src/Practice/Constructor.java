package com.company;

class Student2{
    private int No;
    private String Name;

    public Student2(){
        No = 1;
        Name = "Methods_Examples";
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
public class Constructor {
    public static void main(String[] args) {

        Student2 obj = new Student2();
        System.out.println("No : " + obj.getNo());
        System.out.println("Name : " + obj.getName());
    }
}
