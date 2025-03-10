package _24_Exception_handling;

public class Arryaindexoutofbound_Exception {


    public static void main(String[] args) {
        try {


            int arr[] = {1, 2, 3, 4, 5, 6};
            System.out.println(arr[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bound exception has occurred!");
        }
    }
}
