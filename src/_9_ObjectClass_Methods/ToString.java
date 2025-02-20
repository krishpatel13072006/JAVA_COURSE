package _9_ObjectClass_Methods;

//return  String representation of object
public class ToString {
    String name;
    int age;

    public  ToString(String n,int x){
        this.name=n;
        this.age=x;
    }

    //overiding toString()
    public String toString()
    {
        return "My name is "+name+". I am "+age+" years old";
    }

    public static void main(String[] args) {
        ToString obj=new ToString("krish Patel", 18);
        System.out.println(obj); //toString() is automatically called when object is printed.
        System.out.println(obj.toString());

        System.out.println(obj.getClass());//returns class name along with class keyword
        System.out.println(obj.getClass().getName());//return Class name

        System.out.println(obj.hashCode());//returns hashcode of following object

    }
}
