package _11_Constructor;

public class Default_constructor {
    String name;
    int age;

    public void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        Default_constructor ibj = new Default_constructor();
        ibj.display();
    }
}
/*
constructor with no parameters are called default constructor
java compiler will automatically class default constructor if class does not contain any constructor
default constructor is used to provide default values to object like int=0, string=null ,etc.
*/
