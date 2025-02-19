package _4__Conditional_Statements;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter valur of A");
        int a=sc.nextInt();
        System.out.println("enter valur of B");
        int b=sc.nextInt();
        int result;


        System.out.println("enter 1 for addition, 2 for subtraction, 3 for Multiplication, 4 for division and 5 for modulus");
int number=sc.nextInt();

        switch (number)
        {
            case 1:
                result=a+b;
                System.out.println(result);
                break;
            case 2:
                result=a-b;
                System.out.println(result);
                break;
            case 3:
                result=a*b;
                System.out.println(result);
                break;
            case 4:
                result=a/b;
                System.out.println(result);
                break;
            case 5:
                result=a%b;
                System.out.println(result);
                break;
            default:
                System.out.println("you have entered wrong input!");
        }
    }
}
