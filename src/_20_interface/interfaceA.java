package _20_interface;

public interface interfaceA {

    abstract void a();

    default void hello() {
        System.out.println("Default method of interfaceA");
    }

    //static method
    public static void speak() {
        System.out.println("Speaks true always");
    }

    //private method
    private void car() {
        System.out.println("private method of interface cannot be accessed");
    }
}
