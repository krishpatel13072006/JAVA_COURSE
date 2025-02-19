package _5__Loops;
import java .util.Scanner;
public class while_loop {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to get Table!");
        int num= sc.nextInt();

        int i=1;

        while (i<=10)
        {
            System.out.println(num+" * "+i+" = "+num*i);
            i++;
        }
    }
}
