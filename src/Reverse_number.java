import java.util.Scanner;

public class Reverse_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to  Reverse it : ");
        int num = sc.nextInt();

        //to reverse any number -- ex-1234;
        //find remainder of that number one by one
        //add that remainder into 0 * 10
        //rev=0*10+remainder;
        //rev=0*10+4;  rev=4;
        //rev=4*10+3;  rev=43;
        //.
        //.
        //.

        int r;
        int reverse = 0;
        while (num != 0) {
            r = num % 10;
            reverse = reverse * 10 + r;
            num = num / 10;

        }
        System.out.println(reverse);

    }
}
