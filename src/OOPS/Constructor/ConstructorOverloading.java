package OOPS.Constructor;
class Student2 {
    private int No;
    private String Name;

    public Student2(){
        No = 1;
        Name = "Nimit Patel";
    }
    public Student2(String name){
        No = 2;
        Name = name;
    }
    public Student2(String name, int no){
        No = no;
        Name = name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getName(){
        return Name;
    }
    public void setNo(int no){
        No = no;
    }
    public int getNo(){
        return No;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        Student2 obj1 = new Student2();
        Student2 obj2 = new Student2("Nik Patel");
        Student2 obj3 = new Student2("Yug Patel",3);
        System.out.print("\n");

        System.out.println("No : " + obj1.getNo());
        System.out.println("Name : " + obj1.getName());
        System.out.print("\n");

        System.out.println("No : " +obj2.getNo());
        System.out.println("Name : " + obj2.getName());
        System.out.print("\n");

        System.out.println("No : " +obj3.getNo());
        System.out.println("Name : " + obj3.getName());
    }
}
