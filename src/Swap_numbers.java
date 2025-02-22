public class Swap_numbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        int temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //without using another variable;
        /*
        a=a+b+c;
        b=a-(b+c);
        c=a-(c+b);
        a=a-(b+c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        */
    }
}
