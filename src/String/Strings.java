package String;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        String firstname = new String("Nimit");
        System.out.print(firstname);
        String lastname ="Patel";
        System.out.println(lastname);

        Scanner str = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name1 = str.nextLine();
        System.out.printf("%s\n",name1);

        System.out.print("Enter your name : ");
        String name2 = str.next();
        System.out.println(name2);

    }
}
