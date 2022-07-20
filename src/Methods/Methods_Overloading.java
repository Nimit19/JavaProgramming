package Methods;

public class Methods_Overloading {
    static void m1(){
        System.out.println("x : " + 1);
    }
    static void m1(int x){
        System.out.println("x : "+ x);
    }

    static void m1(String n){
        System.out.println(n);
    }
    static void m1(int x,int y){
        System.out.println("x : "+ x);
        System.out.println("y : "+ y);

    }
    public static void main(String[] args) {

        m1();
        m1(50);
        m1("Methods_Examples");
        m1(10,20);
    }
}
