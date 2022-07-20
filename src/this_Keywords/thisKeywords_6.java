/*
    5] Using ‘this’ keyword to invoke current class method
 */

class Test6 {

    void display()
    {
        // calling function show()
        this.show();
        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show function");
    }

}
public class thisKeywords_6 {
    public static void main(String[] args) {

        Test6 t1 = new Test6();
        t1.display();

    }
}
