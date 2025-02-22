package _12_Static_keyword;

public class Nested_class {

    static int num;

    public static void show() {
        System.out.println("static method of outer class");
    }


    static class innerclass {

        public void display() {
            num = 10;
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Nested_class.innerclass obj = new Nested_class.innerclass();
        obj.display();
        Nested_class.show();

    }
}

