package OOPS.Inheritance.Type;

class Sparrow extends Birds{
    String Name = "Sparrow";
    boolean IsFlying = true;
    String Color = "Brown";

    void info(){
        System.out.println("Name : " +  Name);
        System.out.println("Colour : " + Color);
        System.out.println("IsFlying : " + IsFlying);
    }
}

public class I01_SingleInheritance {
    public static void main(String[] args) {

        Sparrow obj = new Sparrow();
        obj.info();

    }
}
