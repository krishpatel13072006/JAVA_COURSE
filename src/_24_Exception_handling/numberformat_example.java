package _24_Exception_handling;

public class numberformat_example {

    public static void main(String[] args) {

        try{
            String s="12345";
            String x="krish";
            int num=Integer.parseInt(s);
            float v=Float.parseFloat(x);
            System.out.println(num);
            System.out.println(v);
        }catch(NumberFormatException e)
        {
            System.out.println("number format exception has occurred!!");
            System.out.println("you cannot convert String with inappropriate format in numeric values!!");
        }
    }

}
