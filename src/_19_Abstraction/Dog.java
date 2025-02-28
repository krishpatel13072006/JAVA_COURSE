package _19_Abstraction;

public class Dog extends Animal {

    @Override
    public void c() {
        System.out.println("Method C");
    }

    public void d() {
        System.out.println("Method D");
    }

    public static void main(String[] args) {

        Animal x = new Dog();

        x.a();
        x.b();
        x.c();
        x.d();
        x.eat();
        x.sleep();
        x.show();
        Animal.sound();
        interfaceA.hello();

    }
}
