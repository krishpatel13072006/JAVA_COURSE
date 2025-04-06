package _26_Arrays;

public class maxSubArraySum_2 {

    public static void prefixSum(int arr[])
    {
        int currentSum=0;
        int maxsum=Integer.MIN_VALUE;

        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i <prefix.length ; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }


        for (int i = 0; i <arr.length ; i++) {

            for (int j = i; j <arr.length ; j++) {

                currentSum= (i==0)?prefix[j]:prefix[j]-prefix[i-1];

                if (maxsum<currentSum)
                {
                    maxsum=currentSum;
                }
            }

        }
        System.out.println(maxsum);
    }


    public static void main(String[] args) {

        int num[]={1,2,3};
        prefixSum(num);
    }
}
