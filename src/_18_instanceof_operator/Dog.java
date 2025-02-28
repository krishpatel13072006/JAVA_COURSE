package _18_instanceof_operator;

public class Dog extends Animal {
    Dog() {
        super(19);

    }

    public static void main(String[] args) {

        Animal t1 = new Dog();
        System.out.println(t1 instanceof Animal);//true


        Dog t2 = null;
        System.out.println(t2 instanceof Dog);//false


    }
}
