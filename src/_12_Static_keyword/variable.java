package _12_Static_keyword;

public class variable {

    //static variable is shared among all instance of classes
    static int count;

    String name;

    public static void count() {

        System.out.println(count);
        count++;


    }

    public static void main(String[] args) {
        variable x = new variable();
        x.count();
        variable x1 = new variable();
        x1.count();

    }
}
