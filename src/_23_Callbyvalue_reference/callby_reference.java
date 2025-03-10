package _23_Callbyvalue_reference;

public class callby_reference {

    int data = 50;

    void calculate(callby_reference obj) {
        obj.data = obj.data + 100;
    }

    public static void main(String[] args) {
        callby_reference t1 = new callby_reference();
        System.out.println("before change" + t1.data);
        t1.calculate(t1);
        System.out.println("after change" + t1.data);

    }
}
