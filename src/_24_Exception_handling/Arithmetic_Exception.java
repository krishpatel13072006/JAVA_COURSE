package _24_Exception_handling;

public class Arithmetic_Exception {


    public static int array(int a, int b) {
        try {
            return a / b;
        } catch (
                ArithmeticException n) {
            System.out.println("Arithmetic exception ahs occurred");
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {5, 5, 5, 0, 5};


        for (int i = 0; i < arr1.length; i++) {
            System.out.println(array(arr1[i], arr2[i]));
        }
    }
}
