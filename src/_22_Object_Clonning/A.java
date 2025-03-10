package _22_Object_Clonning;

import java.lang.Cloneable;

/*
object cloning is the method use to create a new copy or clone of original object.
-TO clone object----
1)class must implement cloneable interface otherwise it will give classnotsupported exception.
2)clone method in java is used to create new copy of original object.
 */
public class A implements Cloneable {

    String name;

    A(String x) {
        name = x;
        System.out.println(x);
    }

    public static void main(String[] args) {
        try {
            A n = new A("rekha");
            A onj = (A) n.clone();
            System.out.println(onj.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
