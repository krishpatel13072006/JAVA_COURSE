package _24_Exception_handling;

//unchecked exception need not to be declare or caught

public class throw_1 {
    public static void calculateage(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is not valid ");
        } else {
            System.out.println("welcome !");
        }
    }

    public static void main(String[] args) {
        try {
            calculateage(15);
        } catch (ArithmeticException e) {
            System.out.println("exception occur");
        }
    }
}
