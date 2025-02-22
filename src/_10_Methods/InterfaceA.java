package _10_Methods;

public interface InterfaceA {

    //interface contains default methods
    //default methods have their own default implementation
    //declare using default keyword
    default void Common_method()
    {
        System.out.println("Default method of InterfaceA");
    }
}
