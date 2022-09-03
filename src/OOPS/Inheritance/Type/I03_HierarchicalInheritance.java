package OOPS.Inheritance.Type;

class Penguin extends Birds{
    boolean IsFlying = false;
    String Colour = "Black";
    String Name = "Penguin";

    void info(){
        System.out.println("Name : " + Name);
        System.out.println("Colour : " + Colour);
        System.out.println("IsFlying : " + IsFlying);
    }
}

class Peacock extends Birds{
    boolean IsFlying = true;
    String Colour = "Green";
    String Name = "Peacock";

    void info(){
        System.out.println("Name : " + Name);
        System.out.println("Colour : " + Colour);
        System.out.println("IsFlying : " + IsFlying);
    }
}

class Pigeon extends Birds{
    boolean IsFlying = true;
    String Colour = "Brown";
    String Name = "Pigeon";

    void info(){
        System.out.println("Name : " + Name);
        System.out.println("Colour : " + Colour);
        System.out.println("IsFlying : " + IsFlying);
    }
}
public class I03_HierarchicalInheritance {
    public static void main(String[] args) {

        Penguin obj1 = new Penguin();
        obj1.info();
        System.out.println();

        Peacock obj2 = new Peacock();
        obj2.info();
        System.out.println();

        Pigeon obj3 = new Pigeon();
        obj3.info();


    }
}
