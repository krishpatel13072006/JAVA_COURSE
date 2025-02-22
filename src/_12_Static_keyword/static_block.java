package _12_Static_keyword;

public class static_block {

    //used to initialise static variable
    static int num;

    static {
        num = 10;
        System.out.println("i will be executed before constructor and methods");
    }

    public static void display() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        static_block.display();
    }
}
