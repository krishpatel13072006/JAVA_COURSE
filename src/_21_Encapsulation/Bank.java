package _21_Encapsulation;
/*encapsulation is the process of wrapping data members and fields in single unit
encapsulation is used to achieve-
 1:Data hiding
 2:full control over the data*/


public class Bank {

    //encapsulation can be achieve-
    //by declaring all data members as private and creating public getter and setter methods
    private String name;
    private long acc_no;
    private float  balance;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }


    public void setAcc_no(long acc_no)
    {
        this.acc_no=acc_no;
    }
    public long getAcc_no()
    {
        return acc_no;
    }

    public void setBalance(float balance)
    {
        this.balance=balance;
    }
    public float getBalance()
    {
        return balance;
    }


    public static void main(String[] args) {
        Bank obj=new Bank();
        obj.setBalance(25000.0f);
        obj.setName("krish patel");
        obj.setAcc_no(224550307035l);

        System.out.println(obj.getName()+" "+obj.getAcc_no()+" "+obj.getBalance());

    }
}
