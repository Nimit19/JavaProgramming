package OOPS.Static;

class Test {
    static int a ;
    int b;

    void display1(){
        a++;
        b++;
        System.out.println("a : " + a + " b : " + b);
    }

}
public class StaticKeywords {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.display1();
        t2.display1();
    }
}

/*
---------------------------------------------

class Static1
{
    int a,c;
    static int b;

    public void display()
    {
         System.out.println("a is "+a);
         System.out.println("b is "+b);
    }
    public static void inca()
    {
        a++;
        b++;
    }

     public static void main(String args[])
     {


          int d;
          d=10;


        Static1 s1 = new Static1();
        s1.inca();
        s1.display();


        Static1 s2 = new Static1();
        s2.inca();
        s2.display();

    Static1 s3 = new Static1();
        s3.inca();
         s3.display();
      //  geta();
       // getb();
		// Although we don't have an object of Test, static block is
		// called because i is being accessed in following statement.
		// System.out.println("static variable is"+Static1.b);
	}
}


------------------------------------------

 class Test
{
	static int i;
	static
	{
		i = 10;
		System.out.println("static block called in class");
	}
}
class statice
{
	static int j;
	static
	{
		j = 20;
		System.out.println("static block called in main");
	}
	public static void main(String args[])
	 {
		System.out.println("In main");
		System.out.println("i is "+Test.i);
	}

}


-------------------------------------------

*/
