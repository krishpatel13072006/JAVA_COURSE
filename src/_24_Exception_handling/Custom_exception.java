package _24_Exception_handling;

//user defined exception

public class Custom_exception extends Exception {

    public Custom_exception(String msg)
    {
        super(msg);
    }

    public static void main(String[] args) {
        try{
            throw new Custom_exception("user defined exception");
        }catch(Custom_exception e)
        {
            System.out.println(e.toString());
        }
    }
}
