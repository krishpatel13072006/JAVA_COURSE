package _2_Variable;

public class Static_variable {

    //static variables are created at once any shared among multiple objects of class
    public static String name = "krishna";
    public static int number = 14;
    public static String college;

    //constructor of class
    public Static_variable() {
        //executed second after initial block
        name = "krish patel";
        System.out.println(name);

    }

    public static void hello() {
//executed after constructor
        //this will override the first name
        Static_variable.name = "priya";
        System.out.println(Static_variable.name);

        //value of variable can be set using class name in constructor and methods and blocks
//        Static_variable.number = 23;
        System.out.println(number);
    }

    {
        //initial block
//        executed first
        Static_variable.name = "kalpesh";
        System.out.println(Static_variable.name);

        Static_variable.number = 19;
    }

    public static void main(String[] args) {
        Static_variable obj = new Static_variable();

        obj.hello();

        System.out.println(Static_variable.name);
        System.out.println(number);

        Static_variable.college = "AIET";
        System.out.println(college);

        //values are changed based on property of execution of blocks and components of class
    }
}

//the value of a static variable can be changed whenever it is reassigned, and the changes are
//reflected throughout the class.

//The value of number changes throughout the execution as follows:
//
//Initially, it's 14.
//
//The initialization block changes it to 19.
//
//The hello() method changes it to 23.
//
//The final value printed is the value after the hello() method execution, which is 23