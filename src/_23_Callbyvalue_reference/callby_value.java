package _23_Callbyvalue_reference;

public class callby_value {
    int data = 50;

    public void calculate(int data) {
        data = data + 100;

    }

    public static void main(String[] args) {

        callby_value x = new callby_value();
        System.out.println("before change" + x.data);
        x.calculate(100);
        System.out.println("after change" + x.data);
    }
}
