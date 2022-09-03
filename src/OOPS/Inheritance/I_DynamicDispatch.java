package OOPS.Inheritance;

class Bird
{
    String Name;

    public void food()
    {
        System.out.println("Food...");
    }
}

class Sparrow extends Bird
{
    public void voice()
    {
        System.out.println("Voice : chi-chi-chi...");
    }
}


public class I_DynamicDispatch {
    public static void main(String[] args) {
        Bird t1 = new Sparrow();
        t1.food();

//         t1.voice(); -> Error!
        // Sparrow t2 = new Bird(); -> Error!

    }
}
