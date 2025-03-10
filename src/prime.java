import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int flag = 0;
        int factor = 0;

        if (num == 0 || num == 1) {
            System.out.println("not prime");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
//                    System.out.println("not prime");
//                    flag=1;
                    factor++;
                    break;
                }
            }
            if (factor == 0) {
                System.out.println("number is prime");
            } else {
                System.out.println("number is not prime");
            }
        }


    }
}
