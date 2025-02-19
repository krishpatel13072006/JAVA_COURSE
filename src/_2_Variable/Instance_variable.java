package _2_Variable;

public class Instance_variable {
    //instance variables
    String name;
    int age;
    String language;

    //class constructor
    public Instance_variable() {
        age = 20;
    }


    public void show() {
        this.language = "english";
        System.out.println(language);
    }

    public static void main(String[] args) {
        Instance_variable x = new Instance_variable();

        //calling variable using class object
        System.out.println("MY age is:" + x.age);


        //we can set the values of variable using class object
        x.name = "krish patel";
        System.out.println(x.name);

        x.show();


    }
}
