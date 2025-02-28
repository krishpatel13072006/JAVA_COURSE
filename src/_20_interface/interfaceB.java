package _20_interface;

public interface interfaceB {

    abstract void b();

    default void hello() {
        System.out.println("Default method of interfaceA");
    }


}
