package _13_this_keyword;

//this keyword in java used to refer current class instance
public class object {

    void show() {
        //this can be passed as an argument in method to refer current class instance object
        System.out.println(this);
    }

    public static void main(String[] args) {
        object x = new object();
        System.out.println(x);

        x.show();
    }
}
