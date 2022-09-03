package Recursion.String;

public class SkipWords {
    public static void main(String[] args) {

        String s = "abapplecdef";
        System.out.println(skipWord(s));
    }

    static String skipWord(String s1){
        if(s1 == ""){
            return "";
        }
        char ch = s1.charAt(0);

        if(s1.startsWith("apple")){
            return skipWord(s1.substring(5));
        }else {
            return ch + skipWord(s1.substring(1));
        }
    }
}
