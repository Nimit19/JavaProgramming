package OOPS.Method;

class Nimit{
    public int a;

    public void name(){
        System.out.println("My Name is Nimit");
    }

    public void method2(){
        System.out.println("MY Name is Nimit");
    }
}
class Nik extends Nimit{

    @Override
    public void method2() {
        System.out.println("My Name is Nik");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Nimit a = new Nimit();
        Nik b = new Nik();
        a.name();
        b.name();

        System.out.print("\n");
        a.method2();
        b.method2();

    }
}
