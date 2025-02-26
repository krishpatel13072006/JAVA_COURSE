package _17_ISA_and_HAS_A_relation;

public class honda extends car_ISA {
    @Override
    public void model() {
        System.out.println("honda");
    }

    void makeSound() {
        System.out.println("honda makes loud sound");
    }

    public static void main(String[] args) {

        car_ISA obj = new car_ISA();
        obj.model();

        //dynamic binding
        //upcasting
        car_ISA t1 = new honda();
        t1.model();

        //downCasting
        honda x1 = (honda) t1;
        x1.makeSound();

    }
}
