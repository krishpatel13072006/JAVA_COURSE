package _13_this_keyword;

import _11_Constructor.Constructor_chaining_1;
//this() in java is used for constructor chaining
//where one constructor call another constructor in same class
public class Constructor_chaining {

    String name;
    int age;

    public Constructor_chaining() {
        this("Krissh");
    }

    public Constructor_chaining(String name) {
        this(name, 19);
        this.name = name;

    }

    public Constructor_chaining(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "my name is " + name + " and I am " + age + "years old";
    }

    public static void main(String[] args) {

        Constructor_chaining t1 = new Constructor_chaining();
        Constructor_chaining t2 = new Constructor_chaining("Krissh");
        Constructor_chaining t3 = new Constructor_chaining("Krissh", 20);
        System.out.println( t1.toString());
        System.out.println( t2.toString());
        System.out.println( t3.toString());


    }

}
