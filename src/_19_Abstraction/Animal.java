package _19_Abstraction;

public abstract class Animal implements interfaceA {

    @Override
    public void a() {
        System.out.println("Method A");
    }

    @Override
    public void b() {
        System.out.println("Method B");
    }

    abstract void d();

    public static void sound() {
        System.out.println("Animals make sound");
    }

    public void eat() {
        System.out.println("Animals are eating");
    }

    private void species() {
        System.out.println("Private method of abstract class");
    }

    final void sleep() {
        System.out.println("Animals are sleeping");
    }
}
