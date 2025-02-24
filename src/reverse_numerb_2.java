import java.util.Scanner;

public class reverse_numerb_2 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to Reverse");
        int num=sc.nextInt();

        int temp=num;

        int reverse=0;

        while(temp!=0){
            int r=temp%10;
            reverse=reverse*10+r;
            temp=temp/10;
        }
        System.out.println(reverse);

        if(num==reverse)
        {
            System.out.println("palindrome number");
        }
        else{
            System.out.println("Not palindrome number");
        }
    }
}
