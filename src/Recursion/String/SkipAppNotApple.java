package Recursion.String;

public class SkipAppNotApple {
    public static void main(String[] args) {
        String s1 = "abapplecdef"; // not remove app from apple
        String s2 = "abapplcdef";  // remove app
        System.out.println(skipWord(s1));
        System.out.println(skipWord(s2));
    }
    static String skipWord(String s1){
        if(s1 == ""){
            return "";
        }
        char ch = s1.charAt(0);

        if(s1.startsWith("app") && !(s1.startsWith("apple"))){
            return skipWord(s1.substring(3));
        }else {
            return ch + skipWord(s1.substring(1));
        }
    }

}
