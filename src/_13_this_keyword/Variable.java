package _13_this_keyword;

//this keyword in java used to refer current class instance variable
//its used to differentiate instance variable from local variable
public class Variable {
    String name,gender;


    Variable(String name,String x)
    {
        this.name=name;
        gender=x;
    }

    void show()
    {
        System.out.println(this);
        System.out.println(name+" "+gender);
    }

    public static void main(String[] args) {
        Variable x=new Variable("krish", "male");
        x.show();
    }
}
