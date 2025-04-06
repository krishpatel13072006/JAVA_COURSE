package _26_Arrays;

public class maxSubArraysSum {

    public static void maxofsubarrraysum(int arr[])
    {
        int cuurent=0;
        int maxsum=Integer.MIN_VALUE;
        int n=arr.length;

        for (int i = 0; i <n ; i++) {

            for (int j = i; j <n ; j++) {

                cuurent=0;
                for (int k = i; k <=j ; k++) {
                    cuurent=cuurent+arr[k];
                }

                System.out.println(cuurent);

                if(maxsum<cuurent)
                {
                    maxsum=cuurent;
                }
            }
            System.out.println();
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int num[]={1,2,3,4,5};

        maxofsubarrraysum(num);
    }
}
