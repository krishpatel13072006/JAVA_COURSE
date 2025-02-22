package _12_Static_keyword;

public class variable_2 {

    static int age;
    static String name;

    //value of static variables can be changed based on the priorities of class components

    variable_2()
    {
        System.out.println("constructor will executed after initialise block");
        age=19;//value is changed and reassigned to 19
        System.out.println(age);

    }

    static {
        System.out.println("static block will executed first");
        age=20;//value set to 20;
        System.out.println(age);
    }

    {
        System.out.println("initialise block will executed second");
        age=21;//value is changed and reassigned to 21
        System.out.println(age);

    }

    public static void display()
    {
        System.out.println("static method will executed after constructor");
        age=22;//value is changed and reassigned to 22
        System.out.println(age);
    }

    public static void main(String[] args) {
        variable_2 onj=new variable_2();
        display();
        System.out.println(variable_2.age);
        System.out.println(variable_2.name);
    }
}
