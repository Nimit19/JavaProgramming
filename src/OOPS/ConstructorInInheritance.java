class Name1{

    public String name;
    Name1(){
        System.out.println("1] My Name is Nimit");
    }
    Name1(String name){
        System.out.println("1] My Name is " + name);
    }

}
class Surname1 extends Name1{

    public String Surname;
    Surname1(){
        System.out.println("2] My Surname is Patel");
    }
    Surname1(String surname){
        System.out.println("2] My Surname is " + surname);
    }
    Surname1(String name, String surname){
        super(name);
        System.out.println("2] My Surname is " + surname);

    }
}

class Id extends Surname1{

    public int Id;
    Id(){
        System.out.println("3] My Id is 1");
    }

    Id(int id){
        System.out.println("3] My Id is " + id);
    }

    Id(String name,String surname ,int id){
        super(name,surname);
        System.out.println("3] My Id is " + id);
    }

}
public class ConstructorInInheritance {
    public static void main(String[] args) {
         System.out.print("\n");

         Name1 n1 = new Name1(); // Default Constructor
         System.out.print("\n");

         Name1 n2 = new Name1("Nik");
         System.out.print("\n");
         System.out.print("\n");


         Surname1 s1 = new Surname1();
         System.out.print("\n");

         Surname1 s2 = new Surname1("Tandel");
         System.out.print("\n");

         Surname1 s3 = new Surname1("Mekvin","Tandel");
         System.out.print("\n");
         System.out.print("\n");


         Id i1 = new Id();
         System.out.print("\n");

         Id i2 = new Id(2);
         System.out.print("\n");

         Id i3 = new Id("Ankit","Prajapati" ,3);
         System.out.print("\n");

    }
}
