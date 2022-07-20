package com.company;

class T1 extends Thread{
    int i = 0;
    @Override
    public void run(){
        while(i<400){
            System.out.println("I am t1 class's method....");
            System.out.println("Hiii...");
            i++;
        }
    }
}

class T2 extends Thread{
     int i = 0;
     @Override
     public void run(){
        while(i<400){
            System.out.println("I am t2 class's method...");
            System.out.println("Helloooo...");
            i++;
        }
    }
}

public class ThreadDemo
{
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        t1.start();
        t2.start();

    }
}
