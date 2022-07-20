package OOPS;

class T3 implements Runnable{
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

class T4 implements Runnable{
    int i = 0;
    @Override
    public void run(){
        while(i<400){
            System.out.println("I am t2 class's method....");
            System.out.println("Hellooooo...");
            i++;
        }
    }
}

public class ThreadDemo2
{
    public static void main(String[] args) {

        T3 t1 = new T3();
        Thread r1 = new Thread(t1);

        T4 t2 = new T4();
        Thread r2 = new Thread(t2);

        r1.start();
        r2.start();

    }
}
