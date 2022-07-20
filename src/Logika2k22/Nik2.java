package Logika2k22;

import java.util.Scanner;

class check{
    int Xor(int a , int b){
        int c = 5;

        if(a==0 && b ==0){
            c = 0;
        }
        else if(a==1 && b==1){
            c = 0;
        }
        else if(a==0 && b==1){
            c = 1;
        }
        else if(a==1 && b==0){
            c = 1;
        }
        return c;
    }

    int And(int a , int b){
        int c = 5 ;
        if(a==0 && b ==0){
            c = 0;
        }
        else if(a==1 && b==1){
            c = 1;
        }
        else if(a==0 && b==1){
            c = 0;
        }
        else if(a==1 && b==0){
            c = 0;
        }
        return c;
    }

    int Or(int a , int b){
        int c = 5;

        if(a==0 && b ==0){
            c = 0;
        }
        else if(a==1 && b==1){
            c = 1;
        }
        else if(a==0 && b==1){
            c = 1;
        }
        else if(a==1 && b==0){
            c = 1;
        }
        return c;
    }

    int OperationsBinaryString(String str) {
        char a;
        int b;
        int c;
        int ans = -1;

        if (str.length()==0 || str.length()%2==0){
            return -1;
        }

        for (int i = 1; i < str.length(); i = i + 2) {

            a = str.charAt(i);
            b = str.charAt((i - 1));
            c = str.charAt(i + 1);

            if (b==49){
                b = 1;
            }
            else if(b==48){
                b = 0;
            }

            if (c==49){
                c = 1;
            }
            else if(c==48){
                c = 0;
            }

            if (i == 1) {

                if (a == 'c' || a == 'C') {
                    ans = Xor(b, c);
                } else if (a == 'a' || a == 'A') {
                    ans = And(b, c);
                } else if (a == 'b' || a == 'B') {
                    ans = Or(b, c);

                }
            }
            else {
                if (a == 'c' || a == 'C') {
                    ans = Xor(ans, c);
                } else if (a == 'a' || a == 'A') {
                    ans = And(ans, c);
                } else if (a == 'b' || a == 'B') {
                    ans = Or(ans, c);
                }
            }


        }
        return ans;
    }
}

class Nik2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        check obj = new check();
        int ans = obj.OperationsBinaryString(str);
        System.out.println(ans);
    }
}