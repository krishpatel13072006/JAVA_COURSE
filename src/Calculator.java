import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A");
        int a= sc.nextInt();
        System.out.println("Enter B");
        int b= sc.nextInt();

        int result;
        System.out.println("enter numbers 1,2,3,4,5 for +,-,*,/,%");
        int number=sc.nextInt();

        switch (number){
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
                System.out.println("You have entered a wrong input!");

        }

    }
}
