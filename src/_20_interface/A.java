package _20_interface;

public class A implements interfaceA, interfaceB {
    @Override
    public void a() {
        System.out.println("Method A");
    }

    @Override
    public void b() {
        System.out.println("Method B");
    }

    @Override
    public void hello() {
        interfaceA.super.hello();
        interfaceB.super.hello();
        System.out.println("overridden default hello method from both interfaces to prevent Compilation error!!!");
    }

    public static void main(String[] args) {
        A t1 = new A();
        t1.a();
        t1.b();
        t1.hello();

        interfaceA obj = new A();
        obj.hello();

        interfaceA.speak();
    }
}
