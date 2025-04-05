package _26_Arrays;

public class Smallest_in_array {

    public  static int Smallest(int arr[])
    {
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (smallest>arr[i])
            {
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {

        int number[]={0,9,43,2,5,6,3,53,2,1,5,4,6372,1,5,26,3,6,72,15,13,662};

        int x= Smallest(number);
        System.out.println(x);
    }
}
