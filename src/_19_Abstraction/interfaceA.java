package _19_Abstraction;

public interface interfaceA {
    abstract void a();
    abstract  void b();
    abstract  void c();

    default void show(){
        System.out.println("default method");
    }

    public static void hello()
    {
        System.out.println("static method");
    }

    private void name() {
        System.out.println("private method");
    }
}
