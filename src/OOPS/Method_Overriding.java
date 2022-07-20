package OOPS;

class Aa{
    void Nik(){
        System.out.println("I am Aa");
    }
}
class Bb extends Aa{
    @Override
     void Nik(){
        System.out.println("I am Bb");
     }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Aa obj1 = new Aa();
        Bb obj2 = new Bb();
        obj1.Nik();
        obj2.Nik();

    }
}
