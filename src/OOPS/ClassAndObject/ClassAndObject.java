package OOPS.ClassAndObject;

class A{
    int RollNo = 95;
    String Name = "Nimit Patel";
    float Marks = 95.6f;
}

public class ClassAndObject {
    public static void main(String[] args) {
        A s1 = new A();
        System.out.println(s1.RollNo);
        System.out.println(s1.Name);
        System.out.println(s1.Marks);

        System.out.println();

        A s2 = new A();
        s2.Name = "Nik Patel";
        s2.RollNo = 38;
        s2.Marks = 99.9f;
        System.out.println(s2.RollNo);
        System.out.println(s2.Name);
        System.out.println(s2.Marks);
    }
}


/*
class : A class is a user defined blueprint or prototype from which objects are created.
        It represents the set of properties or methods that are common to all objects of one type.
        A class is a template that specifies the attributes and behaviour of things or objects.

object : An object is an instance of a class.
         An object means anything from real world like as person, computer, bench etc...
         An object is the variable of the type class.
 */