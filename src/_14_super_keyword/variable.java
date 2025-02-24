package _14_super_keyword;

public class variable {

    String name="krishna";//parent class variables
    int age;

    variable(String name,int age)
    {
        this.name=name;
        this.age=age;

    }

    public void display()
    {
        System.out.println(name+" "+age);
    }

    public void show()
    {
        System.out.println("Parent class method");
    }
}
