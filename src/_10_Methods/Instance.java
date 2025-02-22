package _10_Methods;

public class Instance {

    //instance methods are normals methods which can be accessed using class object or instance
    public int sum(int a, int b) {
//        a=5;
//        b=3;
        return a + b;
    }

    public static void main(String[] args) {

        Instance t1 = new Instance();
        int x = 10;
        int y = 10;
        System.out.println(t1.sum(x, y));

    }
}
