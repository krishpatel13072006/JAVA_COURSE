package _9_ObjectClass_Methods;

public class hashcode {

    int age;

    public hashcode(int age){
        this.age=age;
    }

    public static void main(String[] args) {

        //returns hashcode of given object
        hashcode t1=new hashcode(19);
        System.out.println(t1.hashCode());

        hashcode t2=new hashcode(19);
        System.out.println(t2.hashCode());
    }
}
