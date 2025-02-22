package _11_Constructor;

public class Constructor_chaining_1 {

    String name;
    int age;

    // Default constructor
    public Constructor_chaining_1() {
        this(21);  // Constructor chaining to the parameterized constructor with 1 argument (passing value 21)
    }

    // Constructor with one parameter
    public Constructor_chaining_1(int age) {
        this("krishna", age);  // Constructor chaining to the parameterized constructor with 2 arguments (passing name "krish" and age)
    }

    // Constructor with two parameters
    public Constructor_chaining_1(String name, int age) {
        this.age = age;
        this.name = name;
    }

    // Method to display the name and age
    public void display() {
        System.out.println(name + " " + age);
    }

    // Main method
    public static void main(String[] args) {
        Constructor_chaining_1 t1 = new Constructor_chaining_1();  // Calls the default constructor
        t1.display();  // Displays the name and age for the default constructor

        Constructor_chaining_1 t2 = new Constructor_chaining_1(20);  // Calls the constructor with one parameter
        t2.display();  // Displays the name and age for the constructor with one parameter

        Constructor_chaining_1 t3 = new Constructor_chaining_1("krish", 19);  // Calls the constructor with two parameters
        t3.display();  // Displays the name and age for the constructor with two parameters
    }
}
