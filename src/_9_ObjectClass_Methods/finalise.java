package _9_ObjectClass_Methods;

public class finalise extends Object{

    finalise()
    {
        System.out.println("object is created");
    }

    @Override
    public void finalize()//override finalize method for cleanup code
    {
        System.out.println("object is destroyed");
    }
    public static void main(String[] args) {

        finalise t1=new finalise();
        t1=null;// 1.. by making reference or object to null

        //2.. by assigning object or another object
        // here t2 is assigned to t1 and t1 will be destroyed
        finalise t2=new finalise();
        finalise t3=new finalise();
        t2=t3;


        new finalise();//by creating anonymous object
        System.gc();// this method will force garbage collector to do garbage collection

    }
}
