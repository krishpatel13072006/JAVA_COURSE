import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check whether its Palindrome or not : ");
        int num = sc.nextInt();

        int temp = num;

        int r;
        int reverse = 0;
        while (temp != 0) {
            r = temp % 10;
            reverse = reverse * 10 + r;
            temp = temp / 10;

        }
        System.out.println(reverse);

        if (num == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Palindrome number");
        }
    }
}
