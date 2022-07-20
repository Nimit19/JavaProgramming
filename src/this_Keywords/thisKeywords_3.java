/*
    2] Using this() to invoke current class constructor
*/
 class Test3{
     int a;
     int b;

     Test3(){
         this(10,20);
         System.out.println("2] Inside  default constructor");
         System.out.println("2] a = " + a + "  b = " + b);

     }

     Test3(int a, int b){
         this.a=a;
         this.b=b;
         System.out.println("1] Inside parameterized constructor");
         System.out.println("1] a = " + a + "  b = " + b);
         System.out.println("\n");
     }
}

public class thisKeywords_3 {
    public static void main(String[] args) {

        Test3 object = new Test3();

    }
}
