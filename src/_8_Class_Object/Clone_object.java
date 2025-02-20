package _8_Class_Object;

//by implementing cloneable interface we can create clone object of class;

public class Clone_object implements Cloneable {

    int x;
    public Clone_object(int x)
    {
        this.x=x;
    }

    public int getX(){
        return x;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Clone_object t1=new Clone_object(20);

        //syntax:-
        //className object2=(className)object1.clone();
        Clone_object t2 =(Clone_object)t1.clone();

        System.out.println(t2.getX());
        System.out.println(t2.hashCode());

    }
}

