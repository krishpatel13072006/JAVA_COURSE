import java.util.Scanner;

public class Highest_factor {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();

        int hfactor=0;

        for(int i=num/2;i>=1;i--)
        {
            if(num%i==0)
            {
                hfactor=i;
                break;
            }
        }
        System.out.println(hfactor);
    }
}
