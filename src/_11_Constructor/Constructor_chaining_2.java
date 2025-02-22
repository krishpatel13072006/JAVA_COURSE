package _11_Constructor;

public class Constructor_chaining_2 extends Constructor_chaining_1 {

    char Class; // New field in the subclass

    // Constructor of the subclass, calling the parent class constructor with 'super()'
    public Constructor_chaining_2(String name, int age, char Class) {
        super(name, age); // Calling the parent class constructor
        this.Class = Class; // Initializing the subclass field
        System.out.println("2nd class constructor called ");
    }

    // Overriding the 'display()' method to print subclass and parent class data
    @Override
    public void display() {
        // Displaying values of name, age, and the Class field
        System.out.println(name + " " + age + " " + Class);
    }

    public static void main(String[] args) {
        // Creating an instance of the subclass
        Constructor_chaining_2 x1 = new Constructor_chaining_2("krish", 19, 'A');
        x1.display();  // Calling the overridden 'display()' method
    }
}
