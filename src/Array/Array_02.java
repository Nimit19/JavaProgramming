package Array;

public class Array_02 {
    public static void main(String[] args){
        //  int [] marks = new int [5]; --> 1]
        // int [] marks = {91,92,93,94,95}; --> 2]
        int [] marks;         // --> 3]
        marks = new int [5];
        marks[0]=91;
        marks[1]=92;
        marks[2]=93;
        marks[3]=94;
        marks[4]=95;
        System.out.println("Length of the array : " + marks.length);
        System.out.println("Mark 1 : " + marks[0]);
        System.out.println("Mark 2 : " + marks[1]);
        System.out.println("Mark 3 : " + marks[2]);
        System.out.println("Mark 4 : " + marks[3]);
        System.out.println("Mark 5 : " + marks[4]);
        System.out.print("\n");

        String [] name ={"Nimit","Yug","Jash","Mekvin"};
        System.out.println("Length of the String array : " + name.length);
        System.out.println("1] " + name[0]);
        System.out.println("2] " + name[1]);
        System.out.println("3] " + name[2]);
        System.out.println("4] " + name[3]);
    }
}
