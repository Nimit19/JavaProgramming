package this_Keywords;
/*
1]  Using ‘this’ keyword to refer current class instance variables.
 */

class Test {
    int a;
    int b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a + "  b = " + b);
    }
}

class Test2{
    int a;
    int b;

    Test2(int a, int b) {
        a = a;
        b = b;
    }

    void display() {
        System.out.println("a = " + a + "  b = " + b);
    }
}

public class thisKeywords_2 {
    public static void main(String[] args) {

        System.out.println("~~> Don't using this keywords");
        Test2 object2 = new Test2(10, 20);
        object2.display();
        System.out.print("\n");

        System.out.println("~~> Using this keywords");
        Test object = new Test(10, 20);
        object.display();

    }
}
