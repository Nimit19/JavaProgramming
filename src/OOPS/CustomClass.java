package OOPS;

class Student{
    int No;
    String Name;

    public void details(){
        System.out.println("Student No : " + No);
        System.out.println("Student Name : " + Name);
    }

}

public class CustomClass {
    public static void main(String[] args) {

        Student obj1 = new Student();
        Student obj2 = new Student();

        obj1.No = 1;
        obj1.Name = "Methods_Examples";
        obj1.details();

        obj2.No = 2;
        obj2.Name = "Jash";
        obj2.details();


    }
}

