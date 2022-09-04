package Array;

public class Arrays2 {
    public static void main(String[] args) {

        int [] marks = {91,92,93,94,95};

        System.out.println("Printing elements using for loop : ");
        for (int i=0;i<marks.length;i++){
            System.out.println("Marks " + (i+1) + " : " + marks[i]);
        }
        System.out.print("\n");

        System.out.println("Printing elements using for-each loop : ");
        int i=0;
        for (int element : marks){
            System.out.println("Marks " + (i+1) + " : " + element);
            i++;
        }


    }
}
