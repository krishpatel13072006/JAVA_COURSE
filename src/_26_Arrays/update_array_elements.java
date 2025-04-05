package _26_Arrays;

public class update_array_elements {

    public static void update(int number[])
    {
        for (int i=0;i<number.length;i++)
        {
            number[i]=number[i]+2;
        }

    }
    public static void main(String[] args) {
        int number[]={10,20,30};
        update(number);

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
