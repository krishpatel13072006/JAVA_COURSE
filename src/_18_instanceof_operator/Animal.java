package _18_instanceof_operator;

public class Animal {

    int age;

    Animal(int age) {
        System.out.println("Constructor of Animal");
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    //this block will executed first
    {
        System.out.println("Initializer block");
    }

    public static void main(String[] args) {

        Animal t1 = new Animal(19);
        System.out.println(t1 instanceof Animal);// true
    }
}
