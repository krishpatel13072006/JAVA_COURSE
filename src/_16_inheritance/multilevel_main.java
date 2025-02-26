package _16_inheritance;

public class multilevel_main extends dog{

    void speak()
    {
        System.out.println("animals speaks");
    }

    public static void main(String[] args) {
        multilevel_main x=new multilevel_main();
        x.speak();
        x.bark();
        x.meow();
    }
}
