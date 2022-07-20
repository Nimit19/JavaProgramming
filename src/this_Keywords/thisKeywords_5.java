/*
     4] Using ‘this’ keyword as method parameter
 */

class Test5
{
    int a;
    int b;

    Test5()
    {
        a = 10;
        b = 20;
    }

    // Method that receives 'this' keyword as parameter
    void display(Test5 obj)
    {
        System.out.println("a = " +obj.a + "  b = " + obj.b);
    }

    // Method that returns current class instance
    void get()
    {
        display(this);
    }

}

public class thisKeywords_5 {
    public static void main(String[] args) {

        Test5 object = new Test5();
        object.get();

    }
}
