import java.util.*;

public class Fibonacci_series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of Fibonacci series");
        int count = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2);
        int n3;

        for (int i = 2; i <= count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
