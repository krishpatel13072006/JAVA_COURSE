package _24_Exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_catch_2 {

    public static void divide(int a,int b)
    {
        System.out.println(a/b);
    }
    public static void main(String[] args) {


        try{
            int a[]={10,100,1000};
            int b[]={5,5,0};
            for(int i=0;i<a.length;i++)
            {
                divide(a[i],b[i]);
            }

            System.out.println(a[5]);

            FileInputStream obj=new FileInputStream("abc.txt");


        }catch(ArithmeticException e)
        {
            System.out.println("divide by zero");

        }catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }


    }

}
