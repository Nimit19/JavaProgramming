package Array;

public class Q1_Max {
    public static void main(String[] args) {
        int[] a = {1,20,38,46,50};

        System.out.println("Max : " + max(a));
        System.out.println("Min : " + min(a));

        System.out.println("Max With Range : " + maxRange(a,1,3));
    }

    static int max(int a[]){
        int maxVal = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>maxVal){
                maxVal = a[i];
            }
        }
        return maxVal;
    }

    static int min(int a[]){
        int minVal = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<minVal){
                minVal = a[i];
            }
        }
        return minVal;
    }

    static int maxRange(int a[],int start,int end){
        int maxVal = a[start];
        for (int i = start; i <= end; i++) {
            if(a[i]>maxVal){
                maxVal = a[i];
            }
        }
        return maxVal;
    }
}
