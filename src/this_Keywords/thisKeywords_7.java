/*
    6] Using ‘this’ keyword as an argument in the constructor call
 */

class A1
{
    B obj;

    // Parameterized constructor with object of B
    A1(B obj)
    {
        this.obj = obj;

        // calling display method of class B as a parameter
        obj.display();
    }

}

class B
{
    int x = 5;

    // Default Constructor that create a object of A1 with passing this as an argument in the constructor
    B()
    {
        A1 obj = new A1(this);
    }

    // method to show value of x
    void display()
    {
        System.out.println("Value of x in Class B : " + x);
    }

}

public class thisKeywords_7 {
    public static void main(String[] args) {

        B obj = new B();

    }

}
