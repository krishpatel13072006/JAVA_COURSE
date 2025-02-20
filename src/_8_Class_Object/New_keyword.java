package _8_Class_Object;

//The new keyword in Java is used to create new instances of objects from a class.
//Yes, when you use the new keyword in Java, it dynamically allocates memory for the new object on the heap.
public class New_keyword {

    String name;

    New_keyword(String name)
    {
        this.name=name;
    }

    public String getname()
    {
        return name;
    }
    public static void main(String[] args) {

        New_keyword t1=new New_keyword("krish Patel");
        System.out.println(t1.getname());
    }
}
