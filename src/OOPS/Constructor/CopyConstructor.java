package OOPS.Constructor;

class Box{
    double l;
    double h;
    double w;

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void display(){
        System.out.println(l + " " + h + " " + w);
    }


}

public class CopyConstructor {
    public static void main(String[] args) {
        Box obj1 = new Box(2.5,3.5,4.5);
        obj1.display();

        Box obj2 = new Box(obj1);
        obj2.display();
    }
}
