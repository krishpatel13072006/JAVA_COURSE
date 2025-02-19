package Class_Object;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
}