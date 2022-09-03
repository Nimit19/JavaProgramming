package OOPS.Inheritance.Type;

class Parrot extends Birds{

    String Name = "Parrot";
    String Colour = "Green";
    boolean IsFlying = true;

}

class BabyParrot extends Parrot{
    String Name = "BabyParrot";

    void info(){
        System.out.println("Name : " + Name);
        System.out.println("Colour : " + Colour);
        System.out.println("IsFlying : " + IsFlying);
    }
}

public class I02_MultiLevelInheritance {
    public static void main(String[] args) {

        BabyParrot obj = new BabyParrot();
        obj.info();
    }
}
