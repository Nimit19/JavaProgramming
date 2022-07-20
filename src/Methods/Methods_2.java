package Methods;

public class Methods_2 {
    static void change1(int x,int y){
        x=3;
        y=2;
    }
    static void change2(int [] arr){
        arr[0]=10;
        arr[2]=19;
    }
    public static void main(String[] args) {

        // case 1 :  Changing the Integer
        int a = 19;
        int b = 25;
        System.out.println("The value of a before change1 method call : " + a);
        System.out.println("The value of b before change1 method call : " + b);
        change1(a,b);
        System.out.println("The value of a after change1 method call : " + a);
        System.out.println("The value of b after change1 method call : " + b);
        System.out.print("\n");


        // case 2 :  Changing the Array
        int [] c = {1,2,3,4,5};
        System.out.println("The value of c[0] before change2 method call : " + c[0] );
        System.out.println("The value of c[2] before change2 method call : " + c[2] );
        change2(c);
        System.out.println("The value of c[0] after change2 method call : " + c[0] );
        System.out.println("The value of c[2] after change2 method call : " + c[2] );

    }
}
