package _4__Conditional_Statements;

public class Nested_if {

    public static void main(String[] args) {

        int number=60;

        if(number>50)
        {
            System.out.println(number+" is grater than 50");
            if(number%2==0)
            {
                System.out.println(number+" is divisible by 2");
            }
            else{
                System.out.println(number+" is not divisible by 2");
            }

        }else {
            System.out.println(number+" is smaller than 50");
        }
    }
}
