package _11_Constructor;

public class Parameterised_constructor {

    int age;
    String name;

    private Parameterised_constructor(int x,String y){
        this.age=x;
        this.name=y;
    }
    public static void main(String[] args) {
        Parameterised_constructor t1=new Parameterised_constructor(19,"krish");
//        System.out.println(t1.age);
        Parameterised_constructor t2=new Parameterised_constructor(20,"patel");
        System.out.println(t1.age);
        System.out.println(t2.name);
        System.out.println(t1.name);

    }
}
