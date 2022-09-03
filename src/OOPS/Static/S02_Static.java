package OOPS.Static;

class Test1 {
    static int a = 0 ;
    int b = 0 ;
    void display(){
        a++;
        b++;
        System.out.println("a : " + a + "\n" + "b : " + b );
    }
}

public class S02_Static {
    static
    {
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        System.out.println("For obj t1 : ");
        t1.display();
        System.out.println("For obj t2 : ");
        t2.display();
    }
}