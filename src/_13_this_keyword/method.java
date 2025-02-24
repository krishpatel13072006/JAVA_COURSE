package _13_this_keyword;

//this is used to call or invoke method implicitly in another method
//also called method chaining
public class method {


    void square(int x) {
        System.out.println(" square of " + x + " is :- " + x * x);
    }

    void display() {
        this.square(10);//method is called implicitly using this keyword
    }

}

class demo {
    public static void main(String[] args) {
        method x = new method();
        x.display();

    }
}
