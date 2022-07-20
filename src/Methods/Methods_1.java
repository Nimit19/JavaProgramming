package Methods;

public class Methods_1 {
//    static int sum(int x,int y){
//      int z;
//      z = x + y;
//      return z;
//    }
//    public static void main(String[] args) {
//      int c ;
//      c = sum(5,10);
//      System.out.println("1] Sum : "+ c);
//      System.out.println("2] Sum : "+ sum(8,2));
//      System.out.println("3] Sum : "+ sum(5,3));
//      System.out.println("4] Sum : "+ sum(100,20));
//      System.out.println("5] Sum : "+ sum(500,50));
//    }
     int sum(int x,int y){
         int z;
         z = x + y;
         return z;
    }
    public static void main(String[] args) {
        int c ;
        // c = sum(5,10); --> Error !
        Methods_1 obj = new Methods_1();
        c = obj.sum(5,10);
        System.out.println("1] Sum : "+ c);
        System.out.println("2] Sum : "+ obj.sum(8,2));
        System.out.println("3] Sum : "+ obj.sum(5,3));
        System.out.println("4] Sum : "+ obj.sum(100,20));
        System.out.println("5] Sum : "+ obj.sum(500,50));
     }
}
