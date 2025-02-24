package _14_super_keyword;

public class super_class extends variable{

    String college;
   public  super_class(String name,int age,String college)
    {
        super(name,age);//parent class constructor is invoked in child class constructor
        this.college=college;
    }

    @Override
    public void display()
    {
        System.out.println(name+" "+age+" "+college);//parent class method has been overridden
    }


    public void hello(String name)
    {
        super.show();//parent class method is invoked using this keyword
        super.name=name;//super keyword in java used to refer parent class instance varables
        System.out.println(name);
    }


    public static void main(String[] args) {

        super_class x=new super_class("sajel",45,"AIET");
        x.display();
        x.hello("krissh");

    }
}
