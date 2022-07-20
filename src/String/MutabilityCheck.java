package String;

public class MutabilityCheck {
    public static void main(String[] args) {
	    String a = "Nimit";
	    String b = "Nimit";

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println();

        String c = new String("Nimit");
        String d = new String("Nimit");

        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}
