package _10_Methods;

public class Default implements InterfaceA, InterfaceB {

    public void Common_method() {
        InterfaceA.super.Common_method();
        InterfaceB.super.Common_method();
        System.out.println("Override method");
    }

    public static void main(String[] args) {

        Default obj = new Default();
        obj.Common_method();
    }
}
