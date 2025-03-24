import java.util.Scanner;

public class Prime_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to Check whether its Prime OR Not:- ");
        int n = sc.nextInt();
        int m = n / 2;
        int flag = 0;

        if (n == 0 || n == 1) {
            System.out.println("NON PRIME !");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("NON PRIME !");
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(n + " is Prime !");
            }

        }
    }
}
