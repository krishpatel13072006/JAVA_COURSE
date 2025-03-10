package _24_Exception_handling;

public class nullpointer_example {
    String name = "krish patel";

    public static void main(String[] args) {
        nullpointer_example onj = null;
        try {
            System.out.println(onj.name);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception has occurred!");
            System.out.println("with null object reference no data membered or fields can accessed");
        }
    }
}
