package OOPS;

abstract class Base{
    abstract void display();
}

class Derived extends Base{
    @Override
    void display(){
        System.out.println("Hi...");
    }
}
public class Abstract {
    public static void main(String[] args) {

        // Base obj = new Base(); -> Error!

            Derived a = new Derived();
            a.display();
    }
}
