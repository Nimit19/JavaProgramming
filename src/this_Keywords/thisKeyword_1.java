package this_Keywords;
/*
 ~~> this keywords is a reference variable that refers to the current object inside methods/constructor.

 */

class A{

    void display(){
        System.out.println(this);
    }

}

public class thisKeyword_1 {

    public static void main(String[] args) {

        A obj = new A();
        System.out.println(obj);
        obj.display();
    }
}
