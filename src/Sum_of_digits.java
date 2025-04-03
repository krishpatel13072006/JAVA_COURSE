public class Sum_of_digits {

    public static int sumofnumbers(int n)
    {
        int sum=0;
        int rem;

        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }

        return sum;
    }
    public static void main(String[] args) {

        int v=sumofnumbers(123456789);
        System.out.println(v);

    }
}
