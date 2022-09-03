package OOPS.Constructor;

public class C01_Constructor {
    public static void main(String[] args) {
        C obj = new C();
    }
}

class A{
    int  x = 10;
    A(){
        System.out.println("In class A Constructor");
        System.out.println("Value of x : " + x);
    }
}

class B extends A {
    int y = 20;
    B(){
        System.out.println("In class B Constructor");
        System.out.println("Value of Y : " + y);
    }
}

class C extends B {
    C(){
        System.out.println("In class C Constructor");
        System.out.println("Value of x : " + x);
        System.out.println("Value of Y : " + y);
    }
}
