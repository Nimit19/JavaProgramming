package OOPS.Static;

class Human{
    int age;
    String name;
    boolean isMarried;
    static long  population = 0;

    public Human(int age, String name, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
        Human.population  += 1;
    }
}
public class StaticExample {
    public static void main(String[] args) {

        Human Nimit = new Human(19,"Nimit", false);
        Human Shiv = new Human(21,"Shiv", false);
        Human Niraj = new Human(30,"Niraj", true);

//        System.out.println(Nimit.population);
//        System.out.println(Niraj.population);

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
