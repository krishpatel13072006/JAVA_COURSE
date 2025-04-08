package _26_Arrays;

public class Kadans_algorithm {

    public static int maxofsubarray(int arr[])
    {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {

            currentsum+=arr[i];

            if(currentsum<0)
            {
                currentsum=0;
            }

            if(maxsum<currentsum)
            {
                maxsum=currentsum;
            }
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int num[]={-2,-4,5,-1,-2,1,5};

        int x=maxofsubarray(num);
        System.out.println(x);

    }
}
