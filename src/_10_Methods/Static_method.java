package _10_Methods;

public class Static_method {

    public static void oddeven(int num) {
        if (num % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
//        Static_method t1=new Static_method();
        Static_method.oddeven(20);
        oddeven(17);
    }
}
