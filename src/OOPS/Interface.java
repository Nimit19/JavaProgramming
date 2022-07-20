package com.company;

interface A{
    int a = 5;
    void Display1();
}

interface B{
    int b = 10;
    void Display2();
}

class C implements A,B
{
    public void Display1(){
        System.out.println("I am Display1 function...");
        System.out.println("Value of a : " + a);
    }

    public void Display2(){
        System.out.println("I am Display2 function...");
        System.out.println("Value of b : " + b);
    }
}
public class Interface {
    public static void main(String[] args) {

        C obj = new C();
        obj.Display1();
        obj.Display2();
    }
}
