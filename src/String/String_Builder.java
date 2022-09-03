package String;

public class String_Builder {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Nick Patel");
        // -> String is Immutable, StringBuilder is Mutable

        System.out.println(s1);
        s1.append(" king");
        System.out.println(s1);

    }
}
