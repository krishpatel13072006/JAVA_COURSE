package _3_Wrapper_class;

public class Autoboxing {

    public static void main(String[] args) {
        //automatic conversion of primitive datatype to object
        int x=10;
        Integer n=x;
        System.out.println(n);

        //valueof() method is also used to convert primitive datatype into object
        Integer i=Integer.valueOf(x);
        System.out.println(i);


        byte b=1;
        Byte b1=b;
        System.out.println(b1);


        char c='A';
        Character x1=Character.valueOf(c);
        Character x2=c;
        System.out.println(x1+" "+x2);

    }
}
