/*
    3]  Using ‘this’ keyword to return the current class instance
 */

class Test4
{
    int a;
    int b;

    Test4()
    {
        a = 10;
        b = 20;
    }

    Test4 get()
    {
        return this;
    }

    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }

}
public class thisKeywords_4 {
    public static void main(String[] args) {

        Test4 object = new Test4();
        System.out.println(object.get());
        object.display();

        object.get().display();


    }
}
