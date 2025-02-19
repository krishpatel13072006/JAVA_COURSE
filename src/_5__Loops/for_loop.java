package _5__Loops;

public class for_loop {
    public static void main(String[] args) {

        //factorial of n=1*2*3*4*n;

        int num=5;
        int factorial=1;

        for (int i = 1; i <= num; i++) {
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+num+" = "+factorial);

    }
}
