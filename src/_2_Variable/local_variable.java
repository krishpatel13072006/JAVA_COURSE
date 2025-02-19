package _2_Variable;

public class local_variable {


    public void find_square(int num)
    {
        //local variable
        //cannot Accessible outside method
        int square=num*num*num;
        System.out.println(square);

    }

    public static void main(String[] args)
    {
        //this is local variable
        //this variable can only be accessed in main method
        int age=19;
        System.out.println(age);


        local_variable x=new local_variable();
        x.find_square(10);
    }

}
