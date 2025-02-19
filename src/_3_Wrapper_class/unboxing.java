package _3_Wrapper_class;

public class unboxing {
    public static void main(String[] args) {

        //unboxing in java is used to convert object into primitive datatype

        Integer x=10;
        int x1=x;
        System.out.println(x1);

        Character c='a';
        char c1=c;
        System.out.println(c1+" "+c);

    }
}
/*
Need of Wrapper Classes
There are certain needs for using the Wrapper class in Java as mentioned below:

They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
The classes in java.util package handle only objects and hence wrapper classes help in this case.
Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
An object is needed to support synchronization in multithreading.*/
