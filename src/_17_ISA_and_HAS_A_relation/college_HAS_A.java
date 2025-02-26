package _17_ISA_and_HAS_A_relation;

public class college_HAS_A {

    public void display() {
        System.out.println("College");
    }
}

class teacher {

    private college_HAS_A obj;//one class store an object of another class

    teacher() {
        obj = new college_HAS_A();
    }

    public void show() {
        obj.display();//class display method using college object obj
        System.out.println("Teachers");
    }

    public static void main(String[] args) {

        teacher x = new teacher();
        x.show();
    }

}
