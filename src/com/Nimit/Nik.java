package com.Nimit;

import java.util.Scanner;

public class Nik {

    static int findCount(int arr[],int length,int num,int diff){

        int a = 0;
        int ans = 0;

        for (int i = 0; i < length; i++) {

            int b = arr[i]/num;
            if(b<=1){
                a = arr[i] % num;

                if(a<=diff || a>=(num-diff)){
                    System.out.print(arr[i] + " ");
                    ans = ans + 1;
                }

            }
        }
        System.out.println("");

        if(ans==0){
            return -1;
        }
        else{
            return ans;
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {200,300,100,500,700};
        int length = arr.length;

        System.out.print("Enter the num : ");
        int num = sc.nextInt();
        System.out.println();

        System.out.print("Enter the diff : ");
        int diff = sc.nextInt();

        int ans = findCount(arr,length,num,diff);
        System.out.println(ans);
    }
}
