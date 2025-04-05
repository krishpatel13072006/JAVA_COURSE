public class Largest_in_array {

    public static int largest(int arr[])
    {
        int large=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if (large<arr[i])
            {
                large=arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int number[]={9,43,2,5,6,3,53,2,1,5,4,6372,1,5,26,3,6,72,15,13,662};
        int x= largest(number);
        System.out.println(x);
    }
}
