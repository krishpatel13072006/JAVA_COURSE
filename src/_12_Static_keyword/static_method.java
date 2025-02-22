package _12_Static_keyword;

public class static_method {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        int x = static_method.add(10, 10);
        System.out.println(x);

        multiply(10, 10);
    }
}
