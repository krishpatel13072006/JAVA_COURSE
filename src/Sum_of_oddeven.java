import java.util.Scanner;
public class Sum_of_oddeven {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int num=sc.nextInt();

        int even=0;
        int odd=0;
        for(int i=1;i<=num;i++)
        {
            int x=sc.nextInt();
            if(x%2==0)
            {
                even=even+x;
            }else
            {
                odd=odd+x;
            }
        }
        System.out.println("sum of even numbers :"+even);
        System.out.println("sum of odd numbers :"+odd);



    }
}
