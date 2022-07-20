package Methods;

public class VarArgs_01 {

    static int sum(int ...arr){
        int sum=0;
        for (int a:arr){
            sum+=a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println("1+2 = " + sum(1,2));
        System.out.println("1+2+3 = " + sum(1,2,3));
        System.out.println("1+2+3+4 = " + sum(1,2,3,4));
        System.out.println("1+2+3+4+5 = " + sum(1,2,3,4,5));

    }
}
