package Recursion.String;

public class SkipLatters {
    public static void main(String[] args) {
        String s = "abbaaaaaccd";
        skipLatter1("",s);
        String ans = skipLatter2(s);
        System.out.println(ans);
    }

    // 1]
    static void skipLatter1(String s1, String s2){
        if(s2 == ""){
            System.out.println(s1);
            return;
        }
        char ch = s2.charAt(0);

        if(ch == 'a'){
            skipLatter1(s1,s2.substring(1));
        }else {
            skipLatter1(s1 + ch ,s2.substring(1));
        }
    }

    // 2]
    static String skipLatter2(String s1){
        if(s1 == ""){
            return "";
        }
        char ch = s1.charAt(0);

        if(ch == 'a'){
            return skipLatter2(s1.substring(1));
        }else {
            return ch + skipLatter2(s1.substring(1));
        }
    }
}
