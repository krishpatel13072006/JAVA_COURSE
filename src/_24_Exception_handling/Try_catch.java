package _24_Exception_handling;

public class Try_catch {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
            //line at which exception has occurred in try block below that line rest of code will not be executed
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Arithmetic Exception occurred");
        }
    }
}
