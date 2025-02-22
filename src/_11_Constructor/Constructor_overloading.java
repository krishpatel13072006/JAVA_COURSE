package _11_Constructor;

public class Constructor_overloading {

    protected Constructor_overloading()
    {
        System.out.println("default constructor");
    }

    public   Constructor_overloading(int a)
    {
        System.out.println(a*2);
    }

    protected  Constructor_overloading(int a, int b,int c)
    {
        System.out.println(a+b+c);
    }

    private Constructor_overloading(float a, float b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Constructor_overloading t1=new Constructor_overloading(10);
    }
}
