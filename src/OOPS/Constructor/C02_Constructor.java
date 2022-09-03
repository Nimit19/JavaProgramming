package OOPS.Constructor;

class Student {
    private int No;
    private String Name;

    public Student(){
        No = 1;
        Name = "Nimit Patel";
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
public class C02_Constructor {
    public static void main(String[] args) {

        Student obj = new Student();
        System.out.println("No : " + obj.getNo());
        System.out.println("Name : " + obj.getName());
    }
}
