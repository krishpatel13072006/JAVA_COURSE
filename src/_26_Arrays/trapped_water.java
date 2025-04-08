package _26_Arrays;

public class trapped_water {

    public static int trappedWater(int[] height)
    {
        int x=height.length;

        //calculate left max boundary in helper array
        int leftmax[]=new int[x];//initialise array
        leftmax[0]=height[0];    //first element of both arrays are same

        for (int i = 1; i <x ; i++) {
            leftmax[i]=Math.max(height[i],leftmax[i-1]);//height[i],leftmax[0];
        }


        //calculate rightmax boundary in helper array
        int rightmax[]=new int[x];
        rightmax[x-1]=height[x-1];//starting from last index
        for (int i = x-2; i >=0 ; i--) {

            rightmax[i]=Math.max(height[i],rightmax[i+1]);

        }


        //calculate trappedwater

        int trappedwater=0;
        for (int i = 0; i <x ; i++) {
            int waterlevel=Math.min(leftmax[i],rightmax[i]);

            trappedwater=trappedwater+waterlevel-height[i];

        }

        return trappedwater;


    }

    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int n=trappedWater(arr);
        System.out.println(n);
    }
}
