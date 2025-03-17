package _24_Exception_handling;
//checked exception need to be caught and declare
//they must be handled by using try catch block

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throw_2 {

    public static void file()throws FileNotFoundException
    {
        FileInputStream obj=new FileInputStream("abc.txt");
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try{
            file();
        }catch(FileNotFoundException e)
        {
            System.out.println("exception occurred");
        }
    }
}

