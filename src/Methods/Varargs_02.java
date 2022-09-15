package Methods;

public class Varargs_02 {
    public static void main(String[] args) {
        name("Nimit","jay","yug","shiv");
        name(1,2,3,4,5);
//        name(); // -> give error Embiguty
    }

    static void name(String ...s) {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
    static void name(int ...n){
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
