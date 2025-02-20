package _8_Class_Object;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
public class Newinstance {

    String name;

    public Newinstance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        try {
            // Correct syntax
            Constructor<Newinstance> constructor = Newinstance.class.getConstructor(String.class);
            Newinstance x = constructor.newInstance("Krish Patel");

            System.out.println(x.getName());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            e.printStackTrace();

        }
    }
}*/


public class Newinstance {

    private int age;

    public Newinstance(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        try {
            //syntax
            //Constructor<className> obj1=className.class.getConstructor(String.class,int.class,float.class);
            //className obj2=obj1.newInstance("parameter");

            Constructor<Newinstance> constructor = Newinstance.class.getConstructor(int.class);
            Newinstance instance = constructor.newInstance(10);
            System.out.println(instance.getAge());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

