package _24_Exception_handling;

public class ClassnotfoundExceptionExample {

    public static void main(String[] args) {
        try {
            // Correct usage of Class.forName
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // Proper exception handling
            System.out.println("class not found exception has occurred");
        }
    }
}
